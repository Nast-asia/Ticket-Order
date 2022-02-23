import by.epam.ticketorder.beans.CreditCard;
import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.passenger.PassengerDAO;

public class Initialization {
    public static void init() {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();
        passengerDAO.addPassenger(new Passenger("Nast.asia", "11111111", "Анастасия", "Назаревич", "KB654321", new CreditCard("1234 1234 134 1234", 75.0)));
    }
}
