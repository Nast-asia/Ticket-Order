package by.epam.ticketorder.service.passenger;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.passenger.PassengerDAO;
import by.epam.ticketorder.exceptions.ServiceException;


public class PassengerServiceImp implements PassengerService {
    @Override
    public void registrate(Passenger passenger) throws ServiceException {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();

        if (passengerDAO.readPassenger(passenger.getLogin()) != null)
            throw new ServiceException("Login already exists.");
        passengerDAO.addPassenger(passenger);
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
    }
}
