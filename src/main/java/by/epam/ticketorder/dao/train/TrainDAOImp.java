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
    public Train readTrain(Route route) {
        ArrayList<Train> trainsDS = datasource.getTrains();
        for (int i = 0; i < trainsDS.size(); i++) {
            if (trainsDS.get(i).getRoute().equals(route))
                return trainsDS.get(i);
        }
        return null;
    }

    @Override
    public ArrayList<Train> readAllTrains() {
        ArrayList<Train> trainsDS = datasource.getTrains();
        return trainsDS;
    }
}
