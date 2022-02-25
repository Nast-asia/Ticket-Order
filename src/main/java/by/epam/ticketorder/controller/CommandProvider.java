package by.epam.ticketorder.controller;

import by.epam.ticketorder.controller.commands.*;

import java.util.HashMap;

final class CommandProvider {
    private final HashMap<String, Command> commands = new HashMap<>();

    CommandProvider() {
        commands.put("REGISTRATE", new Registrate());
        commands.put("SIGN_IN", new SignIn());
        commands.put("SIGN_OUT", new SignOut());
        commands.put("BUY_TICKET", new BuyTicket());
        commands.put("RETURN_TICKET", new ReturnTicket());
        commands.put("SEE_CURRENT_TICKETS", new SeeCurrentTickets());
        commands.put("WRONG_REQUEST", new WrongRequest());
    }

    Command getCommand(String name) {
        try {
            return commands.get(name);
        } catch (IllegalArgumentException | NullPointerException e) {
            return commands.get("WRONG_REQUEST");
        }
    }
}