package by.epam.ticketorder.service;

import by.epam.ticketorder.service.passenger.PassengerService;
import by.epam.ticketorder.service.passenger.PassengerServiceImp;
import by.epam.ticketorder.service.route.RouteService;
import by.epam.ticketorder.service.route.RouteServiceImp;
import by.epam.ticketorder.service.train.TrainService;
import by.epam.ticketorder.service.train.TrainServiceImp;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    public static ServiceFactory getInstance() {
        return instance;
    }
    private ServiceFactory() {}

    private final PassengerService passengerService = new PassengerServiceImp();
    public PassengerService getPassengerService() {
        return passengerService;
    }

    private final TrainService trainService = new TrainServiceImp();
    public TrainService getTrainService() {
        return trainService;
    }

    private final RouteService routeService = new RouteServiceImp();
    public RouteService getRouteService() {
        return routeService;
    }
}
