package by.epam.ticketorder.beans;

import java.util.HashMap;

public class Train {
    private Route route;
    private String trainType;
    private int freeSeatsNumber;

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

    public Train(Route route, String trainType, int freeSeatsNumber) {
        this.route = route;
        this.trainType = trainType;
        this.freeSeatsNumber = freeSeatsNumber;
    }

    public Train() {
    }
}
