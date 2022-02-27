package by.epam.ticketorder.dao;

import by.epam.ticketorder.beans.Passenger;
import by.epam.ticketorder.beans.Train;

import java.util.ArrayList;

// List - список элементов (ArrayList - однонаправленный, LinkedList - с указателями)
// Set - список неповторяющихся элементов (HashSet - в порядке алгоритма, LinkedHashSet - в порядке добавления)
// Map - список элементов по уникальному ключу (HashTable - без null, HashMap - допускает null)

/**
 * Класс для базы данных, хранящий все данные в динамических массивах
 */

public class DataSource {
    /**
     * Поле users - хранит всех существующих пользователей
     * Поле trains - хранит все существующие поезда
     */
    public ArrayList<Passenger> users = new ArrayList<>();
    public ArrayList<Train> trains = new ArrayList<>();

    /**
     * Получение списка всех существующих пользователей
     * @return список существующих пользователей
     */
    public ArrayList<Passenger> getUsers() {
        return users;
    }

    /**
     * Перезапись списка существующих пользователей
     * @param users записываемый список пользователей
     */
    public void setUsers(ArrayList<Passenger> users) {
        this.users = users;
    }

    /**
     * Получение списка всех существующих поездов
     * @return список существующих поездов
     */
    public ArrayList<Train> getTrains() {
        return trains;
    }

    /**
     * Перезапись списка существующих поездов
     * @param trains записываемый список поездов
     */
    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }
}
