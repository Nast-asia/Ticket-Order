package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;

public class SignIn implements Command {
    @Override
    public String execute(ArrayList<String> request) {
        String login = request.get(1);
        String password = request.get(2);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PassengerService passengerService = serviceFactory.getPassengerService();

        try {
            passengerService.signIn(login, password);
            return "TICKET_MENU";
        } catch (Exception e) {
            // logger ?
            return "SIGN_IN_MENU";
        }
    }
}
