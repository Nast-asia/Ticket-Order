package by.epam.ticketorder.beans;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        Train that = (Train) obj;
        return freeSeatsNumber == that.freeSeatsNumber &&
                (trainType != null && trainType.equals(that.getTrainType())) &&
                (route != null && route.equals(that.getRoute()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(route, trainType, freeSeatsNumber);
    }

    @Override
    public String toString() {
        return "Train{" +
                "route=" + route +
                ", trainType='" + trainType + '\'' +
                ", freeSeatsNumber=" + freeSeatsNumber +
                '}';
    }
}
