package by.epam.ticketorder.dao;

import by.epam.ticketorder.dao.passenger.PassengerDAO;
import by.epam.ticketorder.dao.passenger.PassengerDAOImp;

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
}
