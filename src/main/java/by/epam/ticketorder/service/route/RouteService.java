package by.epam.ticketorder.service.route;

import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.exceptions.ServiceException;

import java.util.ArrayList;

public interface RouteService {
    ArrayList<Train> seeTimetable(String pointA, String pointB, String date) throws ServiceException;
}
