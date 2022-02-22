package by.epam.ticketorder.dao.passenger;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.dao.DataSource;

import java.util.ArrayList;

public class PassengerDAOImp implements PassengerDAO {
    DataSource datasource = new DataSource();

    @Override
    public void addPassenger(Passenger passenger) {
        ArrayList<Passenger> usersDS = datasource.getUsers();
        usersDS.add(passenger);
        datasource.setUsers(usersDS);
    }

    @Override
    public Passenger readPassenger(String login) {
        ArrayList<Passenger> usersDS = datasource.getUsers();
        Passenger passenger = new Passenger();
        for (int i = 0; i < usersDS.size(); i++) {
            if (usersDS.get(i).getLogin().equals(login)) {
                passenger = usersDS.get(i);
                break;
            }
        }
        return passenger;
    }
}
