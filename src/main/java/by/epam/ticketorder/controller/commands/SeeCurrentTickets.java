package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.passenger.PassengerService;

import java.util.ArrayList;
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
        //TODO: change service.TicketService.seeCurrentTickets()

        logger.debug("SeeCurrentTickets method is started.");

        //FIXME: PassengerService -> TicketService
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PassengerService passengerService = serviceFactory.getPassengerService();

        logger.debug("SeeCurrentTickets method is closed.");
        return null;
    }
}
