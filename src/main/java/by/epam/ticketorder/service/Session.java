package by.epam.ticketorder.service;

import by.epam.ticketorder.beans.Passenger;

public class Session {
    public Passenger onlinePassenger = new Passenger();

    public Passenger getOnlinePassenger() {
        return onlinePassenger;
    }
    public void setOnlinePassenger(Passenger onlinePassenger) {
        this.onlinePassenger = onlinePassenger;
    }
}
