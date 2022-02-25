package by.epam.ticketorder.beans;

public class CreditCard {
    private String creditCardNumber;
    private double creditCardAccount;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getCreditCardAccount() {
        return creditCardAccount;
    }
    public void setCreditCardAccount(double creditCardAccount) {
        this.creditCardAccount = creditCardAccount;
    }

    public CreditCard(String creditCardNumber, double creditCardAccount) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardAccount = creditCardAccount;
    }

    public CreditCard() {
    }
}
