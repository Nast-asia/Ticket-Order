package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс команды авторизации
 */

public class SignIn implements Command {
    private final Logger logger = LogManager.getRootLogger();

    /**
     * Авторизация пользователя в системе
     * @param request данные о вызываемой команде и введенные пользователем
     * @return название меню, вызванное действиями пользователя
     */
    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("SignIn method is started.");
        String login = request.get(1);
        String password = request.get(2);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PassengerService passengerService = serviceFactory.getPassengerService();

        //TODO: change Passenger.online in service.PassengerService.signIn()
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
