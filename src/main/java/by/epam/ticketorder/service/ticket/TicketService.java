package by.epam.ticketorder.service.ticket;

import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.exceptions.ServiceException;

import java.util.TreeSet;

public interface TicketService {
    void buyTicket(String pointA, String pointB, String date, String departureTime) throws ServiceException;

    void returnTicket(Ticket ticket);

    TreeSet<Ticket> seeCurrentTickets() throws ServiceException;
}
