package by.epam.ticketorder.beans;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    private Route route;
    private int seat;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Ticket(Route route, int seat) {
        this.route = route;
        this.seat = seat;
    }

    public Ticket() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        Ticket that = (Ticket) obj;
        return seat == that.seat &&
                (route != null && route.equals(that.getRoute()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(route, seat);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "route=" + route +
                ", seat=" + seat +
                '}';
    }

    // сортировка билетов по времени отправления
    @Override
    public int compareTo(Ticket t) {
        return route.getDepartureTime().compareTo(t.getRoute().getDepartureTime());
    }
}
