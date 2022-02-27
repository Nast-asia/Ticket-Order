package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.ticket.TicketService;

import java.util.ArrayList;

public class BuyTicket implements Command {
    @Override
    public String execute(ArrayList<String> request) {
        String pointA = request.get(1).toUpperCase();
        String pointB = request.get(2).toUpperCase();
        String date = request.get(3);
        String departureTime = request.get(4);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TicketService ticketService = serviceFactory.getTicketService();

        try {
            ticketService.buyTicket(pointA, pointB, date, departureTime);
            return "SEE_CURRENT_TICKETS_MENU";
        } catch (Exception e) {
            // logger ?
            return "BUY_TICKET_MENU";
        }
    }
}
