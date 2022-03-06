package by.epam.ticketorder.dao.ticket;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Ticket;

import java.util.ArrayList;

public interface TicketDAO {
    Ticket readTicket(Passenger passenger, Route route);

    ArrayList<Ticket> readAllTickets(Passenger passenger);

    void addTicket(Passenger passenger, Ticket ticket);

    void deleteTicket(Passenger passenger, Ticket ticket);
}
