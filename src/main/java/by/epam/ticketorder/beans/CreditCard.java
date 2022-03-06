package by.epam.ticketorder.beans;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        CreditCard that = (CreditCard) obj;
        return creditCardAccount == that.creditCardAccount &&
                (creditCardNumber != null && creditCardNumber.equals(that.getCreditCardNumber()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditCardNumber, creditCardAccount);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCardNumber='" + creditCardNumber + '\'' +
                ", creditCardAccount=" + creditCardAccount +
                '}';
    }
}
