package by.epam.ticketorder.service;

import by.epam.ticketorder.service.passenger.PassengerService;
import by.epam.ticketorder.service.passenger.PassengerServiceImp;

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
}
