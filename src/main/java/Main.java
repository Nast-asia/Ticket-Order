import by.epam.ticketorder.view.Menu;

/**
 * Класс запуска программы TicketOrder
 *
 * @author Назаревич Анастасия
 * @version 1.0
 */

public class Main {
    /**
     * Запуск программы
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Initialization.init();
        Menu menu = new Menu();
        menu.mainMenu();
    }
}