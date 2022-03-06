package by.epam.ticketorder.controller;

import java.util.ArrayList;

/**
 * Класс контроллера для передачи параметров вызванной пользователем команде
 */

public final class Controller {
    /**
     * Поле для объекта класса командного провайдера
     */
    private final CommandProvider provider = new CommandProvider();

    /**
     * Выполнение вызванной команды
     *
     * @param request список параметров, указанных пользователем, где первый содержит название вызванной команды
     * @return результат выполнения вызванной команды
     */
    public String doAction(ArrayList<String> request) {
        Command command = provider.getCommand(request.get(0));
        return command.execute(request);
    }
}
