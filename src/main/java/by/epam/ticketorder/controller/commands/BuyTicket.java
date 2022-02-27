package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.ticket.TicketService;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuyTicket implements Command {
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("BuyTicket method is started.");
        String pointA = request.get(1).toUpperCase();
        String pointB = request.get(2).toUpperCase();
        String date = request.get(3);
        String departureTime = request.get(4);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TicketService ticketService = serviceFactory.getTicketService();

        try {
            ticketService.buyTicket(pointA, pointB, date, departureTime);
            logger.debug("BuyTicket method is closed.");
            return "SEE_CURRENT_TICKETS_MENU";
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.debug("BuyTicket method is closed.");
            return "BUY_TICKET_MENU";
        }
    }

}
