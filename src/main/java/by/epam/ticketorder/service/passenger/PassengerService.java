package by.epam.ticketorder.service.passenger;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.exceptions.ServiceException;

public interface PassengerService {
    void registrate(Passenger passenger) throws ServiceException;
    void signIn(String login, String password) throws ServiceException;
    void signOut();
}
