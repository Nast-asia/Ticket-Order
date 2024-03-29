package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Ticket;
import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TreeSet;

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
     *
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

    private void printTickets(TreeSet<Ticket> tickets) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        for (Ticket t : tickets) {
            Route route = t.getRoute();
            System.out.println(route.getPointA() + "-" + route.getPointB() + "\t" +
                    "Место: " + t.getSeat() + "\t" +
                    formatter.format(route.getDepartureTime()) + " - " +
                    formatter.format(route.getArrivalTime())
            );
        }
    }
}
