package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReturnTicket implements Command {
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("ReturnTicket method is started.");
        String message = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PassengerService passengerService = serviceFactory.getPassengerService();

        /* открыть после реализации Exception
        try {
            passengerService.signIn(login, password);
            message = "Вы вошли в систему.";
        } catch (ServiceException e) {
            message = "Ошибка входа в систему.";
        } */

        logger.debug("ReturnTicket method is closed.");
        return message;
    }
}
