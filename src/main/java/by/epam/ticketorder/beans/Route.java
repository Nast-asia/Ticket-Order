package by.epam.ticketorder.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

// SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
// SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");

public class Route {
    private String pointA;
    private String pointB;
    private Date departureTime;
    private Date arrivalTime;
    private double price;

    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public String getPointB() {
        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Route(String pointA, String pointB, String departureTime, String arrivalTime, double price) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        this.pointA = pointA;
        this.pointB = pointB;
        this.price = price;
        try {
            this.departureTime = formatter.parse(departureTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            this.arrivalTime = formatter.parse(arrivalTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Route() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        Route that = (Route) obj;
        return price == that.price &&
                (pointA != null && pointA.equals(that.getPointA())) &&
                (pointB != null && pointB.equals(that.getPointB())) &&
                (departureTime != null && departureTime.equals(that.getDepartureTime())) &&
                (arrivalTime != null && arrivalTime.equals(that.getArrivalTime()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointA, pointB, departureTime, arrivalTime, price);
    }

    @Override
    public String toString() {
        return "Route{" +
                "pointA='" + pointA + '\'' +
                ", pointB='" + pointB + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", price=" + price +
                '}';
    }
}
