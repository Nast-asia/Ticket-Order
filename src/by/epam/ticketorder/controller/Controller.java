package by.epam.ticketorder.controller;

import java.util.ArrayList;

public final class Controller {
    private final CommandProvider provider = new CommandProvider();
    public String doAction(ArrayList<String> request) {
        Command command = provider.getCommand(request.get(0));
        return command.execute(request);
    }
}
