package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SignIn implements Command {
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("SignIn method is started.");
        String login = request.get(1);
        String password = request.get(2);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PassengerService passengerService = serviceFactory.getPassengerService();

        try {
            passengerService.signIn(login, password);
            logger.debug("SignIn method is closed.");
            return "TICKET_MENU";
        } catch (Exception e) {
            logger.debug("SignIn method is closed.");
            logger.error(e.getMessage());
            return "SIGN_IN_MENU";
        }
    }
}
