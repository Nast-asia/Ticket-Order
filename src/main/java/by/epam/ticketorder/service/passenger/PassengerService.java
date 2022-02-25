package by.epam.ticketorder.service.passenger;

import by.epam.ticketorder.beans.Passenger;

public interface PassengerService {
    void logIn(Passenger passenger);
    void signIn(String login, String password);
    void signOut();
}
