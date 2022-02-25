package by.epam.ticketorder.dao;

import by.epam.ticketorder.beans.Passenger;

import java.util.ArrayList;
import java.util.HashMap;

// List - список элементов (ArrayList - однонаправленный, LinkedList - с указателями)
// Set - список неповторяющихся элементов (HashSet - в порядке алгоритма, LinkedHashSet - в порядке добавления)
// Map - список элементов по уникальному ключу (HashTable - без null, HashMap - допускает null)

public class DataSource {
    public ArrayList<Passenger> users = new ArrayList<>();
    public HashMap<String, String> registrationData = new HashMap<>();

    public ArrayList<Passenger> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<Passenger> users) {
        this.users = users;
    }

    public HashMap<String, String> getRegistrationData() {
        return registrationData;
    }
    public void setRegistrationData(HashMap<String, String> registrationData) {
        this.registrationData = registrationData;
    }
}
