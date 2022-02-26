package by.epam.ticketorder.dao.route;

import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.train.TrainDAO;

import java.util.ArrayList;

public class RouteDAOImp implements RouteDAO {
    @Override
    public ArrayList<Train> readRoute(String pointA, String pointB, String date) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        TrainDAO trainDAO = daoObjectFactory.getTrainDAO();

        ArrayList<Train> trainsDS = trainDAO.readAllTrains();
        ArrayList<Train> currentTrains = new ArrayList<>();
        for (int i = 0; i < trainsDS.size(); i++) {
            Route route = trainsDS.get(i).getRoute();
            if (route.getPointA().equals(pointA) &&
                    route.getPointB().equals(pointB) &&
                    route.getDate().equals(date))
                currentTrains.add(trainsDS.get(i));
        }
        return currentTrains;
    }
}
