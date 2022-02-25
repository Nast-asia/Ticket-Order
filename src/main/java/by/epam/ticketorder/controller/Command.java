package by.epam.ticketorder.controller;

import java.util.ArrayList;

public interface Command {
    String execute(ArrayList<String> request);
}
