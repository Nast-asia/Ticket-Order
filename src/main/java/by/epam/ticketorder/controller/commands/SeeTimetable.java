package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.route.RouteService;

import java.util.ArrayList;

public class SeeTimetable implements Command {
    @Override
    public String execute(ArrayList<String> request) {
        String pointA = request.get(1).toUpperCase();
        String pointB = request.get(2).toUpperCase();
        String date = request.get(3);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        RouteService routeService = serviceFactory.getRouteService();

        try {
            ArrayList<Train> timetable = routeService.seeTimetable(pointA, pointB, date);
            System.out.println("\n" + pointA + "-" + pointB + " " + date);
            for (int i = 0; i < timetable.size(); i++) {
                System.out.println(timetable.get(i).getRoute().getDepartureTime() + " - " +
                        timetable.get(i).getRoute().getArrivalTime() + "\t" +
                        timetable.get(i).getTrainType() + "\t" +
                        "Места: " + timetable.get(i).getFreeSeatsNumber()
                );
            }
            return "BUY_TICKET";
        } catch (Exception e) {
            // logger ?
            return "SEE_TIMETABLE";
        }
    }
}
