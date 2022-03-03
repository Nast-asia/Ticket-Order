package by.epam.ticketorder.dao.train;

import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.dao.DataSource;

import java.util.ArrayList;

public class TrainDAOImp implements TrainDAO {
    DataSource datasource = new DataSource();

    @Override
    public void addTrain(Train train) {
        ArrayList<Train> trainsDS = datasource.getTrains();
        trainsDS.add(train);
        datasource.setTrains(trainsDS);
    }

    @Override
    public Train readTrain(String pointA, String pointB, String date, String departureTime) {
        ArrayList<Train> trainsDS = datasource.getTrains();
        for (int i = 0; i < trainsDS.size(); i++) {
            Route route = trainsDS.get(i).getRoute();
            if (route.getPointA().equals(pointA) &&
                    route.getPointB().equals(pointB) &&
                    route.getDate().equals(date) &&
                    route.getDepartureTime().equals(departureTime)
            )
                return trainsDS.get(i);
        }
        return null;
    }

    @Override
    public ArrayList<Train> readAllTrains() {
        return datasource.getTrains();
    }

    @Override
    public void changeTrainInfo(Train train) {
        ArrayList<Train> trainsDS = datasource.getTrains();
        for (int i = 0; i < trainsDS.size(); i++) {
            if (trainsDS.get(i).getRoute().equals(train.getRoute())) {
                trainsDS.remove(i);
                trainsDS.add(i, train);
                break;
            }
        }
        datasource.setTrains(trainsDS);
    }
}
