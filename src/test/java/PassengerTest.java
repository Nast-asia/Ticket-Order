import by.epam.ticketorder.beans.CreditCard;
import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.dao.DAOFactory;
import by.epam.ticketorder.dao.passenger.PassengerDAO;
import by.epam.ticketorder.exceptions.ServiceException;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;
import org.junit.*;

import static org.junit.Assert.*;

import java.util.TreeSet;

public class PassengerTest {
    ServiceFactory serviceFactory = ServiceFactory.getInstance();
    PassengerService passengerService = serviceFactory.getPassengerService();
    DAOFactory daoObjectFactory = DAOFactory.getInstance();
    PassengerDAO passengerDAO = daoObjectFactory.getPassengerDAO();

    private Passenger passenger;

    @Before
    public void initTest() {
        passenger = new Passenger("Login", "Password",
                "Name", "Surname", "PassportNumber",
                new CreditCard("CreditCardNumber", 1000),
                new TreeSet<>()
        );
    }

    @After
    public void afterTest() {
        passenger = null;
    }

    @Test
    public void testRegistrate() {
        try {
            passengerService.registrate(passenger);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = ServiceException.class)
    public void testRegistrateExistingLogin() {
        try {
            passengerService.registrate(passenger);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        try {
            passengerService.registrate(passenger);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSignIn() {
        try {
            passengerService.registrate(passenger);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        try {
            passengerService.signIn("Login", "Password");
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = ServiceException.class)
    public void testSignInInvalidLogin() {
        try {
            passengerService.registrate(passenger);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        try {
            passengerService.signIn("InvalidLogin", "Password");
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = ServiceException.class)
    public void testSignInInvalidPassword() {
        try {
            passengerService.registrate(passenger);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        try {
            passengerService.signIn("Login", "InvalidPassword");
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddPassenger() {
        passengerDAO.addPassenger(passenger);
    }

    @Test
    public void testReadPassenger() {
        try {
            passengerService.registrate(passenger);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        assertEquals(passenger, passengerDAO.readPassenger("Login"));
    }
}
