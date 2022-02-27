package by.epam.ticketorder.dao;

import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.dao.passenger.PassengerDAO;
import by.epam.ticketorder.dao.passenger.PassengerDAOImp;
import by.epam.ticketorder.dao.route.RouteDAO;
import by.epam.ticketorder.dao.route.RouteDAOImp;
import by.epam.ticketorder.dao.ticket.TicketDAO;
import by.epam.ticketorder.dao.ticket.TicketDAOImp;
import by.epam.ticketorder.dao.train.TrainDAO;
import by.epam.ticketorder.dao.train.TrainDAOImp;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    public static DAOFactory getInstance() {
        return instance;
    }
    private DAOFactory() {}

    private final PassengerDAO passengerDAO = new PassengerDAOImp();
    public PassengerDAO getPassengerDAO() {
        return passengerDAO;
    }

    private final RouteDAO routeDAO = new RouteDAOImp();
    public RouteDAO getRouteDAO() {
        return routeDAO;
    }

    private final TrainDAO trainDAO = new TrainDAOImp();
    public TrainDAO getTrainDAO() {
        return trainDAO;
    }

    private final TicketDAO ticketDAO = new TicketDAOImp();
    public TicketDAO getTicketDAO() {
        return ticketDAO;
    }
}
