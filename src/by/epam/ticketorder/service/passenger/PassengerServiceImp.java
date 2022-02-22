package by.epam.ticketorder.service.passenger;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.passenger.PassengerDAO;


public class PassengerServiceImp implements PassengerService {
    @Override
    public void logIn(Passenger passenger) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();
        passengerDAO.addPassenger(passenger);
    }

    @Override
    public void signIn(String login, String password) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();

        Passenger passenger = passengerDAO.readPassenger(login);
        passenger.getPassword().equals(password);
    }

    @Override
    public void signOut() {
        // возможно, пригодится после обработки исключений
    }
}
