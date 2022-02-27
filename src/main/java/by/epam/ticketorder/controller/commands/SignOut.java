package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class SignOut implements Command {
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("SignOut method is started.");
        logger.info("User is signed out.");
        logger.debug("SignOut method is closed.");
        return "\nВы вышли из системы.";
    }
}
