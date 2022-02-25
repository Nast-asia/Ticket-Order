package by.epam.ticketorder.beans;

import java.util.ArrayList;

public class Passenger {
    private String login;
    private String password;
    private String name;
    private String surname;
    private String passportNumber;
    private CreditCard creditCard;
    private ArrayList<Ticket> tickets;

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

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Passenger(String login, String password, String name, String surname, String passportNumber, CreditCard creditCard) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.creditCard = creditCard;
    }

    public Passenger() {
    }
}
