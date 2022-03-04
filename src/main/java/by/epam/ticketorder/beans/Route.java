package by.epam.ticketorder.beans;

import java.util.Objects;

public class Route {
    private String pointA;
    private String pointB;
    private String date;
    private String departureTime;
    private String arrivalTime;
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

    // переопределить
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Route(String pointA, String pointB, String date, String departureTime, String arrivalTime, double price) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
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
                (date != null && date.equals(that.getDate())) &&
                (departureTime != null && departureTime.equals(that.getDepartureTime())) &&
                (arrivalTime != null && arrivalTime.equals(that.getArrivalTime()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointA, pointB, date, departureTime, arrivalTime, price);
    }

    @Override
    public String toString() {
        return "Route{" +
                "pointA='" + pointA + '\'' +
                ", pointB='" + pointB + '\'' +
                ", date='" + date + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", price=" + price +
                '}';
    }
}
