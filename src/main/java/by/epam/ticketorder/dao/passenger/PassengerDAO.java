package by.epam.ticketorder.dao.passenger;

import by.epam.ticketorder.beans.Passenger;

public interface PassengerDAO {
    void addPassenger(Passenger passenger);
    Passenger readPassenger(String login);
    void changePassengerInfo(Passenger passenger);
}
