package by.epam.ticketorder.service.train;

import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.train.TrainDAO;

public class TrainServiceImp implements TrainService {
    @Override
    public void buyTicket(Train train) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        TrainDAO trainDAO = daoObjectFactory.getTrainDAO();

        if (!train.getTrainType().equals("Электричка")) {
            train.setFreeSeatsNumber(train.getFreeSeatsNumber() - 1);
            trainDAO.changeTrainInfo(train);
        }
    }
}
