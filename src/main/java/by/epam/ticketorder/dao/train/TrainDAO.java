package by.epam.ticketorder.dao.train;

import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Train;

import java.util.ArrayList;

public interface TrainDAO {
    void addTrain(Train train);
    Train readTrain(Route route);
    ArrayList<Train> readAllTrains();
}
