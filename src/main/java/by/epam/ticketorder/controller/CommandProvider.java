package by.epam.ticketorder.controller;

import by.epam.ticketorder.controller.commands.*;

import java.util.HashMap;

/**
 * Класс для взаимодействия контроллера с классами команд
 */

final class CommandProvider {
    /**
     * Поле хранения названий и конструкторов существующих команд
     */
    private final HashMap<String, Command> commands = new HashMap<>();

    /**
     * Конструктор - при создании объекта класса добавляет в лист
     * название команды и конструктор класса данной команды
     */
    CommandProvider() {
        commands.put("REGISTRATE", new Registrate());
        commands.put("SIGN_IN", new SignIn());
        commands.put("SIGN_OUT", new SignOut());
        commands.put("SEE_TIMETABLE", new SeeTimetable());
        commands.put("BUY_TICKET", new BuyTicket());
        commands.put("RETURN_TICKET", new ReturnTicket());
        commands.put("SEE_CURRENT_TICKETS", new SeeCurrentTickets());
        commands.put("WRONG_REQUEST", new WrongRequest());
    }

    /**
     * Выбор команды для выполнения
     *
     * @param name название вызываемой команды
     * @return конструктор класса команды, указанную в переданных параметрах
     */
    Command getCommand(String name) {
        try {
            return commands.get(name);
        } catch (IllegalArgumentException | NullPointerException e) {
            return commands.get("WRONG_REQUEST");
        }
    }
}
