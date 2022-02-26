package by.epam.ticketorder.dao.route;

import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Train;

import java.util.ArrayList;

public class RouteDAOImp implements RouteDAO {
    @Override
    public ArrayList<Train> readRoute(String pointA, String pointB, String date, ArrayList<Train> trains) {

        ArrayList<Train> currentTrains = new ArrayList<>();
        for (int i = 0; i < trains.size(); i++) {
            Route route = trains.get(i).getRoute();
            if (route.getPointA().equals(pointA) &&
                    route.getPointB().equals(pointB) &&
                    route.getDate().equals(date))
                currentTrains.add(trains.get(i));
        }
        return currentTrains;
    }
}
