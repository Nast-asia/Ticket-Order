package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/**
 * Класс команды выхода из системы
 */

public class SignOut implements Command {
    private final Logger logger = LogManager.getRootLogger();

    /**
     * Выход пользователя из системы
     * @param request данные о вызываемой команде и введенные пользователем
     * @return сообщение о выходе пользователя из системы
     */
    @Override
    public String execute(ArrayList<String> request) {
        //TODO: change Passenger.online in servise.PassengerService.signOut()

        logger.debug("SignOut method is started.");
        logger.info("User is signed out.");
        logger.debug("SignOut method is closed.");
        return "\nВы вышли из системы.";
    }
}
