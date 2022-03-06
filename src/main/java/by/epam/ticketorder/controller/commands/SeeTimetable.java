package by.epam.ticketorder.controller.commands;

import by.epam.ticketorder.beans.Train;
import by.epam.ticketorder.controller.Command;
import by.epam.ticketorder.service.ServiceFactory;
import by.epam.ticketorder.service.route.RouteService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс команды просмотра расписания поездов
 */

public class SeeTimetable implements Command {
    private final Logger logger = LogManager.getRootLogger();

    /**
     * Просмотр пользователем расписания поездов
     *
     * @param request данные о вызываемой команде и введенные пользователем
     * @return название меню, вызванное действиями пользователя
     */
    @Override
    public String execute(ArrayList<String> request) {
        logger.debug("SeeTimetable method is started.");
        String pointA = request.get(1).toUpperCase();
        String pointB = request.get(2).toUpperCase();
        String date = request.get(3);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        RouteService routeService = serviceFactory.getRouteService();

        try {
            ArrayList<Train> timetable = routeService.seeTimetable(pointA, pointB, date);
            System.out.println("\n" + pointA + "-" + pointB + " " + date);
            printTimetable(timetable);
            logger.debug("SeeTimetable method is closed.");
            return "BUY_TICKET_MENU";
        } catch (Exception e) {
            logger.debug("SeeTimetable method is closed.");
            logger.error(e.getMessage());
            return "SEE_TIMETABLE_MENU";
        }
    }

    private void printTimetable(ArrayList<Train> timetable) {
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        for (int i = 0; i < timetable.size(); i++) {
            Train train = timetable.get(i);
            if (train.getFreeSeatsNumber() > 0 && !train.getTrainType().equals("Электричка")) {
                System.out.println(timeFormatter.format(train.getRoute().getDepartureTime()) + " - " +
                        timeFormatter.format(train.getRoute().getArrivalTime()) + "\t" +
                        train.getTrainType() + "\t" +
                        "Места: " + train.getFreeSeatsNumber() + "\t" +
                        "Цена: " + train.getRoute().getPrice()
                );
            }
            if (train.getTrainType().equals("Электричка")) {
                System.out.println(timeFormatter.format(train.getRoute().getDepartureTime()) + " - " +
                        timeFormatter.format(train.getRoute().getArrivalTime()) + "\t" +
                        train.getTrainType() + "\t" +
                        "Цена: " + train.getRoute().getPrice()
                );
            }
        }
    }
}
