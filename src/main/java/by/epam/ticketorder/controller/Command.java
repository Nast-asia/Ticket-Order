package by.epam.ticketorder.controller;

import java.util.ArrayList;

/**
 * Интерфейс вызванной пользователем команды
 */
public interface Command {
    /**
     * Выполнение вызванной пользователем команды
     * @param request данные о вызываемой команде и введенные пользователем
     * @return результат выполнения вызванной пользователем команды
     */
    String execute(ArrayList<String> request);
}
