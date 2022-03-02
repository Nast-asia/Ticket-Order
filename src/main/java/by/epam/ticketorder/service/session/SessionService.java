package by.epam.ticketorder.service.session;

import by.epam.ticketorder.beans.Passenger;

public interface SessionService {
    void addPassengerSession(Passenger passenger);
    Passenger readPassengerSession();
}
