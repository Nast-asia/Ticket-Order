package by.epam.ticketorder.beans;

import java.util.Objects;
import java.util.TreeSet;

public class Passenger {
    private String login;
    private String password;
    private String name;
    private String surname;
    private String passportNumber;
    private CreditCard creditCard;
    private TreeSet<Ticket> tickets;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public TreeSet<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(TreeSet<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Passenger(String login, String password, String name, String surname, String passportNumber, CreditCard creditCard, TreeSet<Ticket> tickets) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.creditCard = creditCard;
        this.tickets = tickets;
    }

    public Passenger() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        Passenger that = (Passenger) obj;
        return (login != null && login.equals(that.getLogin())) &&
                (password != null && password.equals(that.getPassword())) &&
                (name != null && name.equals(that.getName())) &&
                (surname != null && surname.equals(that.getSurname())) &&
                (creditCard != null && creditCard.equals(that.getCreditCard())) &&
                (tickets != null && tickets.equals(that.getTickets()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, name, surname, passportNumber, creditCard, tickets);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", creditCard=" + creditCard +
                ", tickets=" + tickets +
                '}';
    }
}
