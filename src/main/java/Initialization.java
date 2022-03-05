import by.epam.ticketorder.beans.*;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.DataSource;
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
        trainDAO.addTrain(new Train(new Route("МИНСК", "БРЕСТ", "01.03.2022 12:00", "01.03.2022 16:00", 10.20), "Эконом-класс", 48));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ВИТЕБСК", "01.03.2022 07:30", "01.03.2022 12:00", 17.60), "Бизнес-класс", 92));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ГОМЕЛЬ", "01.03.2022 15:30", "01.03.2022 19:00", 17.60), "Бизнес-класс", 23));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ГРОДНО", "01.03.2022 14:45", "01.03.2022 19:15", 10.20), "Эконом-класс", 55));
        trainDAO.addTrain(new Train(new Route("МИНСК", "МОГИЛЕВ", "01.03.2022 16:20", "01.03.2022 19:50", 10.20), "Эконом-класс", 19));
        trainDAO.addTrain(new Train(new Route("МИНСК", "ОСИПОВИЧИ", "01.03.2022 20:48", "01.03.2022 22:02", 2.25), "Электричка", 0));

        trainDAO.addTrain(new Train(new Route("БРЕСТ", "МИНСК", "01.03.2022 17:00", "01.03.2022 21:00", 10.20), "Эконом-класс", 59));
        trainDAO.addTrain(new Train(new Route("ВИТЕБСК", "МИНСК", "01.03.2022 13:00", "01.03.2022 17:30", 17.60), "Бизнес-класс", 125));
        trainDAO.addTrain(new Train(new Route("ГОМЕЛЬ", "МИНСК", "01.03.2022 20:00", "01.03.2022 23:30", 17.60), "Бизнес-класс", 63));
        trainDAO.addTrain(new Train(new Route("ГРОДНО", "МИНСК", "01.03.2022 09:10", "01.03.2022 13:40", 10.20), "Эконом-класс", 15));
        trainDAO.addTrain(new Train(new Route("МОГИЛЕВ", "МИНСК", "01.03.2022 20:30", "01.03.2022 23:50", 10.20), "Эконом-класс", 36));
        trainDAO.addTrain(new Train(new Route("ОСИПОВИЧИ", "МИНСК", "01.03.2022 21:38", "01.03.2022 23:01", 2.25), "Электричка", 0));

        trainDAO.addTrain(new Train(new Route("TEST", "TEST", "01.03.2022 00:00", "01.03.2022 00:00", 10.20), "Эконом-класс", 2));
        trainDAO.addTrain(new Train(new Route("TEST", "TEST", "01.03.2022 01:01", "01.03.2022 01:01", 2.25), "Электричка", 0));
    }
}
