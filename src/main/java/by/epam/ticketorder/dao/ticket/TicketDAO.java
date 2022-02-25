package by.epam.ticketorder.dao.ticket;

import by.epam.ticketorder.beans.Ticket;

import java.util.ArrayList;

public interface TicketDAO {
    void buyTicket(String pointA, String pointB, String date, String departureTime);
    void returnTicket(Ticket ticket);
    ArrayList<Ticket> seeCurrentTickets();
}
