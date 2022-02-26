package by.epam.ticketorder.service.route;

import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.route.RouteDAO;
import by.epam.ticketorder.dao.train.TrainDAO;
import by.epam.ticketorder.exceptions.ServiceException;

import java.util.ArrayList;

public class RouteServiceImp implements RouteService {
    @Override
    public ArrayList<Train> seeTimetable(String pointA, String pointB, String date) throws ServiceException {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        RouteDAO routeDAO = daoObjectFactory.getRouteDAO();
        TrainDAO trainDAO = daoObjectFactory.getTrainDAO();

        ArrayList<Train> trainsDS = trainDAO.readAllTrains();
        if (routeDAO.readRoute(pointA, pointB, date, trainsDS).isEmpty())
            throw new ServiceException("No trains on the route.");
        return routeDAO.readRoute(pointA, pointB, date, trainsDS);
    }
}
