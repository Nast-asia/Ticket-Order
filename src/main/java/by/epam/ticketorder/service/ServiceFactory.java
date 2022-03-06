package by.epam.ticketorder.service;

import by.epam.ticketorder.service.passenger.PassengerService;
import by.epam.ticketorder.service.passenger.PassengerServiceImp;
import by.epam.ticketorder.service.route.RouteService;
import by.epam.ticketorder.service.route.RouteServiceImp;
import by.epam.ticketorder.service.session.SessionService;
import by.epam.ticketorder.service.session.SessionServiceImp;
import by.epam.ticketorder.service.ticket.TicketService;
import by.epam.ticketorder.service.ticket.TicketServiceImp;
import by.epam.ticketorder.service.train.TrainService;
import by.epam.ticketorder.service.train.TrainServiceImp;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ServiceFactory() {
    }

    private final PassengerService passengerService = new PassengerServiceImp();

    public PassengerService getPassengerService() {
        return passengerService;
    }

    private final RouteService routeService = new RouteServiceImp();

    public RouteService getRouteService() {
        return routeService;
    }

    private final TrainService trainService = new TrainServiceImp();

    public TrainService getTrainService() {
        return trainService;
    }

    private final TicketService ticketService = new TicketServiceImp();

    public TicketService getTicketService() {
        return ticketService;
    }

    private final SessionService sessionService = new SessionServiceImp();

    public SessionService getSessionService() {
        return sessionService;
    }
}
