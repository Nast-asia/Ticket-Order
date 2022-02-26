package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;

public class SignOut implements Command {
    @Override
    public String execute(ArrayList<String> request) {
        return "\nВы вышли из системы.";
    }
}
