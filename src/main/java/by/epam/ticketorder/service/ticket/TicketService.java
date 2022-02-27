package by.epam.ticketorder.service.ticket;

import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.exceptions.ServiceException;

import java.util.ArrayList;

public interface TicketService {
    void buyTicket(String pointA, String pointB, String date, String departureTime) throws ServiceException;
    void returnTicket(Ticket ticket);
    ArrayList<Ticket> seeCurrentTickets();
}
