package by.epam.ticketorder.service.ticket;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.train.TrainDAO;
import by.epam.ticketorder.exceptions.ServiceException;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;
import by.epam.ticketorder.service.session.SessionService;
import by.epam.ticketorder.service.train.TrainService;

import java.util.TreeSet;

public class TicketServiceImp implements TicketService {

    @Override
    public void buyTicket(String pointA, String pointB, String date, String departureTime) throws ServiceException {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        TrainDAO trainDAO = daoObjectFactory.getTrainDAO();

        Train train = trainDAO.readTrain(pointA, pointB, date, departureTime);
        if (train.getFreeSeatsNumber() == 0 && !train.getTrainType().equals("Электричка"))
            throw new ServiceException("No free seats.");

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SessionService sessionService = serviceFactory.getSessionService();
        PassengerService passengerService = serviceFactory.getPassengerService();
        TrainService trainService = serviceFactory.getTrainService();

        Passenger passenger = sessionService.readPassengerSession();

        Ticket ticket = new Ticket(train.getRoute(), train.getFreeSeatsNumber());
        passengerService.buyTicket(passenger, ticket);
        trainService.buyTicket(train);
    }

    @Override
    public void returnTicket(Ticket ticket) {
    }

    @Override
    public TreeSet<Ticket> seeCurrentTickets() throws ServiceException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SessionService sessionService = serviceFactory.getSessionService();

        Passenger passenger = sessionService.readPassengerSession();

        if (passenger.getTickets().size() == 0)
            throw new ServiceException("Passenger has no tickets.");
        return passenger.getTickets();
    }
}
