package by.epam.ticketorder.service.ticket;

import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.ticket.TicketDAO;
import by.epam.ticketorder.dao.train.TrainDAO;
import by.epam.ticketorder.exceptions.ServiceException;

import java.util.ArrayList;

public class TicketServiceImp implements TicketService {
    @Override
    public void buyTicket(String pointA, String pointB, String date, String departureTime) throws ServiceException {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        TicketDAO ticketDAO = daoObjectFactory.getTicketDAO();
        TrainDAO trainDAO = daoObjectFactory.getTrainDAO();

        Train train = trainDAO.readTrain(pointA, pointB, date, departureTime);
        if (train.getFreeSeatsNumber() == 0 && !train.getTrainType().equals("Электричка"))
            throw new ServiceException("No free seats.");
        //TODO: compare Train.price to Passenger.creditCardAccount
        //FIXME: try to change TrainDAOImp
        //FIXME: Passenger.online can help
    }

    @Override
    public void returnTicket(Ticket ticket) {
        //TODO: realize this method
    }

    @Override
    public ArrayList<Ticket> seeCurrentTickets() {
        //TODO: realize this method
        return null;
    }
}
