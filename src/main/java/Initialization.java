import by.epam.ticketorder.beans.*;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.passenger.PassengerDAO;
import by.epam.ticketorder.dao.train.TrainDAO;

import java.util.ArrayList;

/**
 * Класс инициализации данных перед вызовом меню
 */

public class Initialization {
    /**
     * Инициализация данных, необходимых для работы программы
     */
    public static void init() {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();

        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();
        passengerDAO.addPassenger(new Passenger("Nast.asia", "1111", "Анастасия", "Назаревич", "KB654321", new CreditCard("1234 1234 134 1234", 75.0), new ArrayList<Ticket>()));
        passengerDAO.addPassenger(new Passenger("Test", "test", "Name", "Surname", "KB654321", new CreditCard("1234 1234 134 1234", 11.0), new ArrayList<Ticket>()));

        TrainDAO trainDAO = daoObjectFactory.getTrainDAO();
        trainDAO.addTrain(new Train(new Route("МИНСК", "БРЕСТ", "01.03.22", "12:00", "16:00", 10.20), "Эконом-класс", 48));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ВИТЕБСК", "01.03.22", "07:30", "12:00", 17.60), "Бизнес-класс", 92));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ГОМЕЛЬ", "01.03.22", "15:30", "19:00", 17.60), "Бизнес-класс", 23));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ГРОДНО", "01.03.22", "14:45", "19:15", 10.20), "Эконом-класс", 55));
        trainDAO.addTrain(new Train(new Route("МИНСК", "МОГИЛЕВ", "01.03.22", "16:20", "19:50", 10.20), "Эконом-класс", 19));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ОСИПОВИЧИ", "01.03.22", "20:48", "22:02", 2.25), "Электричка", 0));

        trainDAO.addTrain(new Train(new Route("БРЕСТ", "МИНСК", "01.03.22", "17:00", "21:00", 10.20), "Эконом-класс", 59));
        trainDAO.addTrain(new Train(new Route("ВИТЕБСК", "МИНСК", "01.03.22", "13:00", "17:30", 17.60), "Бизнес-класс", 125));
        trainDAO.addTrain(new Train(new Route("ГОМЕЛЬ", "МИНСК", "01.03.22", "20:00", "23:30", 17.60), "Бизнес-класс", 63));
        trainDAO.addTrain(new Train(new Route("ГРОДНО", "МИНСК", "01.03.22", "09:10", "13:40", 10.20), "Эконом-класс", 15));
        trainDAO.addTrain(new Train(new Route("МОГИЛЕВ", "МИНСК", "01.03.22", "20:30", "23:50", 10.20), "Эконом-класс", 36));
        trainDAO.addTrain(new Train(new Route("ОСИПОВИЧИ", "МИНСК", "01.03.22", "21:38", "23:01", 2.25), "Электричка", 0));

        trainDAO.addTrain(new Train(new Route("TEST", "TEST", "01.01.01", "00:00", "00:00", 10.20), "Эконом-класс", 2));
        trainDAO.addTrain(new Train(new Route("TEST", "TEST", "01.01.01", "01:01", "01:01", 2.25), "Электричка", 0));
    }
}
