package by.epam.ticketorder.dao.route;

import by.epam.ticketorder.beans.Train;

import java.util.ArrayList;

public interface RouteDAO {
    ArrayList<Train> readRoute(String pointA, String pointB, String date);
}
