package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;

import java.util.ArrayList;

public class WrongRequest implements Command {
    @Override
    public String execute(ArrayList<String> request) {
        return "Выбрано неверное действие. Повторите попытку.";
    }
}
