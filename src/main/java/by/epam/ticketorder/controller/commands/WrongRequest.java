package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WrongRequest implements Command {
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("WrongRequest method is started.");
        logger.error("Wrong request.");
        logger.debug("WrongRequest method is closed.");
        return "Выбрано неверное действие. Повторите попытку.";
    }
}
