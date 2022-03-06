package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс ошибочного ввода при выборе пользователем команды
 */

public class WrongRequest implements Command {
    private final Logger logger = LogManager.getRootLogger();

    /**
     * Метод - некорректный выбор пользователя при вызове команды
     *
     * @param request данные о вызываемой команде и введенные пользователем
     * @return сообщение о некорректности данных
     */
    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("WrongRequest method is started.");
        logger.error("Wrong request.");
        logger.debug("WrongRequest method is closed.");
        return "Выбрано неверное действие. Повторите попытку.";
    }
}
