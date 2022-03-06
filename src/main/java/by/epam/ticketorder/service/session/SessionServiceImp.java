package by.epam.ticketorder.service.session;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.service.Session;

public class SessionServiceImp implements SessionService {
    Session session = new Session();

    @Override
    public void addPassengerSession(Passenger passenger) {
        session.setOnlinePassenger(passenger);
    }

    @Override
    public Passenger readPassengerSession() {
        return session.getOnlinePassenger();
    }
}
