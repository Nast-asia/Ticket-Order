package by.epam.ticketorder.comparators;

import by.epam.ticketorder.beans.Ticket;

import java.util.Comparator;

public class TicketComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        return t1.getRoute().getDepartureTime().compareTo(t2.getRoute().getDepartureTime());
    }
}
