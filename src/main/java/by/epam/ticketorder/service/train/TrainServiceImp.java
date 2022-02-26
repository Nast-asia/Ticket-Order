package by.epam.ticketorder.service.train;

import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.train.TrainDAO;

public class TrainServiceImp implements TrainService {
    DAOFactory daoObjectFactory = DAOFactory.getInstance();
    TrainDAO trainDAO = daoObjectFactory.getTrainDAO();

}
