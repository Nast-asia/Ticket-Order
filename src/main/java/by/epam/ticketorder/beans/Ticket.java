package by.epam.ticketorder.beans;

public class Ticket {
    private Route route;
    private int wagon;
    private int seat;
    private double price;
    private String seatType;

    public Route getRoute() {
        return route;
    }
    public void setRoute(Route route) {
        this.route = route;
    }

    public int getWagon() {
        return wagon;
    }
    public void setWagon(int wagon) {
        this.wagon = wagon;
    }

    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeatType() {
        return seatType;
    }
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public Ticket(Route route, int wagon, int seat, double price, String seatType) {
        this.route = route;
        this.wagon = wagon;
        this.seat = seat;
        this.price = price;
        this.seatType = seatType;
    }

    public Ticket() {
    }
}
