package by.epam.ticketorder.dao.train;

import by.epam.ticketorder.beans.Train;

import java.util.ArrayList;

public interface TrainDAO {
    void addTrain(Train train);
    Train readTrain(String pointA, String pointB, String date, String departureTime);
    ArrayList<Train> readAllTrains();
    void changeTrainInfo(Train train);
}
