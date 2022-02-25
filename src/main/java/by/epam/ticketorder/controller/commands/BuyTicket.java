package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;

public class BuyTicket implements Command {
    @Override
    public String execute(ArrayList<String> request) {
        String message = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PassengerService passengerService = serviceFactory.getPassengerService();

        /* открыть после реализации Exception
        try {
            passengerService.signIn(login, password);
            message = "Вы вошли в систему.";
        } catch (ServiceException e) {
            message = "Ошибка входа в систему.";
        } */

        return message;
    }
}
