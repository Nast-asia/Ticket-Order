package by.epam.ticketorder.beans;

public class Timetable {
    private Route route;

    public Route getRoute() {
        return route;
    }
    public void setRoute(Route route) {
        this.route = route;
    }

    public Timetable(Route route) {
        this.route = route;
    }

    public Timetable() {
    }
}
