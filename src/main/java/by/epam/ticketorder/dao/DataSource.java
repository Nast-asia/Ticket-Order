package by.epam.ticketorder.dao;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.beans.Route;
import by.epam.ticketorder.beans.Train;

import java.util.ArrayList;
import java.util.HashMap;

// List - список элементов (ArrayList - однонаправленный, LinkedList - с указателями)
// Set - список неповторяющихся элементов (HashSet - в порядке алгоритма, LinkedHashSet - в порядке добавления)
// Map - список элементов по уникальному ключу (HashTable - без null, HashMap - допускает null)

public class DataSource {
    public ArrayList<Passenger> users = new ArrayList<>();
    public ArrayList<Train> trains = new ArrayList<>();

    public ArrayList<Passenger> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<Passenger> users) {
        this.users = users;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }
    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }
}
