package by.epam.ticketorder.beans;

public class Ticket {
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
}
