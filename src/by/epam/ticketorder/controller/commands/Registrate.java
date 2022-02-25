package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.beans.CreditCard;
import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;

public class Registrate implements Command {
    @Override
    public String execute(ArrayList<String> request) {
        String login = request.get(1);
        String password = request.get(2);
        String name = request.get(3);
        String surname = request.get(4);
        String passportNumber = request.get(5);
        CreditCard creditCard = new CreditCard(
                request.get(6),
                Double.parseDouble(request.get(7))
        );
        String message = "\nРегистрация прошла успешно.";
        Passenger passenger = new Passenger(name, surname, login, password, passportNumber, creditCard);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PassengerService passengerService = serviceFactory.getPassengerService();

        /* открыть после реализации Exception
        try {
            passengerService.logIn(name, surname, login, password, passportNumber, creditCard);
        } catch (ServiceException e) {
            message = "Ошибка регистрации.";
        } */

        passengerService.logIn(passenger);
        return message;
    }
}
