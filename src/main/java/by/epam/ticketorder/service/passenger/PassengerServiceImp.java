package by.epam.ticketorder.service.passenger;

import by.epam.ticketorder.beans.CreditCard;
import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.passenger.PassengerDAO;
import by.epam.ticketorder.exceptions.ServiceException;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.session.SessionService;

import java.text.SimpleDateFormat;
import java.util.TreeSet;

public class PassengerServiceImp implements PassengerService {
    @Override
    public void registrate(Passenger passenger) throws ServiceException {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();
        if (passengerDAO.readPassenger(passenger.getLogin()) != null)
            throw new ServiceException("Login already exists.");
        passengerDAO.addPassenger(passenger);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SessionService sessionService = serviceFactory.getSessionService();
        sessionService.addPassengerSession(passenger);
    }

    @Override
    public void signIn(String login, String password) throws ServiceException {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();

        if (passengerDAO.readPassenger(login) == null)
            throw new ServiceException("Incorrect login.");
        Passenger passenger = passengerDAO.readPassenger(login);
        if (!passenger.getPassword().equals(password))
            throw new ServiceException("Incorrect password.");

        // сессия пассажира
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SessionService sessionService = serviceFactory.getSessionService();
        sessionService.addPassengerSession(passenger);
    }

    public void buyTicket(Passenger passenger, Ticket ticket) throws ServiceException {
        CreditCard creditCard = passenger.getCreditCard();
        double price = ticket.getRoute().getPrice();
        if (price > creditCard.getCreditCardAccount())
            throw new ServiceException("Not enough money.");
        creditCard.setCreditCardAccount(creditCard.getCreditCardAccount() - price);
        passenger.setCreditCard(creditCard);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
        TreeSet<Ticket> tickets = passenger.getTickets();
        for (Ticket t : tickets) {
            Route route = t.getRoute();
            String routeDate = dateFormatter.format(route.getDepartureTime());
            String ticketDate = dateFormatter.format(ticket.getRoute().getDepartureTime());
            if (route.getPointA().equals(ticket.getRoute().getPointA()) &&
                    route.getPointB().equals(ticket.getRoute().getPointB()) &&
                    routeDate.equals(ticketDate))
                throw new ServiceException("Passenger has ticket on this route.");
        }
        tickets.add(ticket);
        passenger.setTickets(tickets);

        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();

        passengerDAO.changePassengerInfo(passenger);
    }
}
