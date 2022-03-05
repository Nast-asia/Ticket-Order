package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import by.epam.ticketorder.service.ticket.TicketService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс команды просмотра купленных билетов
 */

public class SeeCurrentTickets implements Command {
    private final Logger logger = LogManager.getRootLogger();

    /**
     * Просмотр всех купленных пользователем билетов
     * @param request данные о вызываемой команде и введенные пользователем
     * @return название меню, вызванное действиями пользователя
     */
    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("SeeCurrentTickets method is started.");
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TicketService ticketService = serviceFactory.getTicketService();

        try {
            printTickets(ticketService.seeCurrentTickets());
            logger.debug("SeeCurrentTickets method is closed.");
            return "CONTINUE";
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.debug("SeeCurrentTickets method is closed.");
            return "TICKET_MENU";
        }
    }

    private void printTickets(ArrayList<Ticket> tickets) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            Route route = ticket.getRoute();
            System.out.println(route.getPointA() + "-" + route.getPointB() + "\t" +
                    "Место: " + ticket.getSeat() + "\t" +
                    formatter.format(route.getDepartureTime()) + " - " +
                    formatter.format(route.getArrivalTime())
            );
        }
    }
}
