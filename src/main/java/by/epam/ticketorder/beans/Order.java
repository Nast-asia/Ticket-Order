package by.epam.ticketorder.beans;

public class Order {
    private Passenger passenger;
    private Ticket ticket;
    private boolean paymentStatus;

    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Order(Passenger passenger, Ticket ticket, boolean paymentStatus) {
        this.passenger = passenger;
        this.ticket = ticket;
        this.paymentStatus = paymentStatus;
    }

    public Order() {
    }
}
