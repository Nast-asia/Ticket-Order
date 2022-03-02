package by.epam.ticketorder.beans;

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
}
