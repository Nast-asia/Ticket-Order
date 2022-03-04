package by.epam.ticketorder.beans;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        Order that = (Order) obj;
        return paymentStatus == that.paymentStatus &&
                (passenger != null && passenger.equals(that.getPassenger())) &&
                (ticket != null && ticket.equals(that.getTicket()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(passenger, ticket, paymentStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "passenger=" + passenger +
                ", ticket=" + ticket +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
