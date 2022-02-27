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
        for (int i = 0; i < usersDS.size(); i++) {
            if (usersDS.get(i).getLogin().equals(login)) {
                return usersDS.get(i);
            }
        }
        return null;
    }

    //TODO: public boolean readPassengerOnline(String login)
    //TODO: public boolean changePassengerOnline(String login)
    //FIXME: add method to PassengerDAO interface
}
