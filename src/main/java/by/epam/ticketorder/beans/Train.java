package by.epam.ticketorder.beans;

import java.util.HashMap;

public class Train {
    private Route route;
    private String trainType;
    private int freeSeatsNumber;
    private double price;

    public Route getRoute() {
        return route;
    }
    public void setRoute(Route route) {
        this.route = route;
    }

    public String getTrainType() {
        return trainType;
    }
    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public int getFreeSeatsNumber() {
        return freeSeatsNumber;
    }
    public void setFreeSeatsNumber(int freeSeatsNumber) {
        this.freeSeatsNumber = freeSeatsNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Train(Route route, String trainType, int freeSeatsNumber, double price) {
        this.route = route;
        this.trainType = trainType;
        this.freeSeatsNumber = freeSeatsNumber;
        this.price = price;
    }

    public Train() {
    }
}
