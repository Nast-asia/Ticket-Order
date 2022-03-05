package by.epam.ticketorder.dao.ticket;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.comparators.TicketComparator;
import by.epam.ticketorder.dao.DataSource;

import java.util.ArrayList;
import java.util.TreeSet;

public class TicketDAOImp implements TicketDAO {
    DataSource datasource = new DataSource();

    @Override
    public Ticket readTicket(Passenger passenger, Route route) {
        return null;
    }

    @Override
    public ArrayList<Ticket> readAllTickets(Passenger passenger) {
        return null;
    }

    @Override
    public void addTicket(Passenger passenger, Ticket ticket) {
        ArrayList<Passenger> usersDS = datasource.getUsers();
        TreeSet<Ticket> userTickets = new TreeSet<>();
        for (int i = 0; i < usersDS.size(); i++) {
            String login = usersDS.get(i).getLogin();
            if (login.equals(passenger.getLogin())) {
                userTickets.add(ticket);
                passenger.setTickets(userTickets);
                break;
            }
        }
        datasource.setUsers(usersDS);
    }

    @Override
    public void deleteTicket(Passenger passenger, Ticket ticket) {

    }
}
