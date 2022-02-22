package by.epam.ticketorder.view;

import by.epam.ticketorder.controller.Controller;

import java.util.ArrayList;
import java.util.Scanner;

// создать отдельные классы для вторичных меню
//которые будут наслежлваться от класса Menu
public class Menu implements MenuProcessing {
    Scanner in = new Scanner(System.in);

    // list for command parameters
    ArrayList<String> params = new ArrayList<>();
    Controller controller = new Controller();

    @Override
    public void processData(Controller controller) {
        System.out.println(controller.doAction(params));
        params.clear();
    }

    public void mainMenu() {
        System.out.println("\n\tБРОНИРОВАНИЕ ЖД БИЛЕТОВ" +
                "\n1. Войти\n2. Зарегистрироваться\n3. Закрыть приложение");
        switch (in.next()) {
            case "1" : {
                signInMenu();
                break;
            }
            case "2" : {
                logInMenu();
                break;
            }
            case "3" : {
                exitMenu();
                break;
            }
            default : {
                System.out.println("\nНеверный ввод данных, повторите попытку.");
                mainMenu();
            }
        }
    }

    public void secondMenu() {
        System.out.println("\n\tНАВИГАЦИОННАЯ ПАНЕЛЬ" +
                "\n1. Купить билет\n2. Сдать билет\n3. Посмотреть приобретённые билеты" +
                "\n4. Посмотреть расписание\n5. Изменить данные банковской карты\n6. Выйти");
        switch (in.next()) {
            case "1" : {
                buyTicketMenu();
                break;
            }
            case "2" : {
                returnTicketMenu();
                break;
            }
            case "3" : {
                seeCurrentTicketsMenu();
                break;
            }
            case "4" : {
                seeTimetableMenu();
                break;
            }
            case "5" : {
                changeCreditCardMenu();
                break;
            }
            case "6" : {
                signOutMenu();
                mainMenu();
                break;
            }
            default : {
                System.out.println("\nНеверный ввод данных, повторите попытку.");
                secondMenu();
            }
        }
    }

    public void logInMenu() {
        params.add("LOG_IN");
        System.out.print("\n\tРЕГИСТРАЦИОННАЯ ФОРМА" +
                "\nИмя: "); params.add(in.next());
        System.out.print("Фамилия: "); params.add(in.next());
        System.out.print("Логин: "); params.add(in.next());
        System.out.print("Пароль: "); params.add(in.next());
        System.out.print("Номер паспорта: "); params.add(in.next());
        System.out.print("Номер банковской карты: "); params.add(in.next());
        System.out.print("Счёт: "); params.add(in.next());

        processData(controller);
        secondMenu();
    }

    public void signInMenu(){
        params.add("SIGN_IN");
        System.out.print("\n\tВОЙТИ В СИСТЕМУ" +
                "\nЛогин: "); params.add(in.next());
        System.out.print("Пароль: "); params.add(in.next());

        try {
            processData(controller);
            params.clear();
            secondMenu();
        } catch (Exception e) {
            params.clear();
            signInMenu();
        }
    }

    public void signOutMenu() {
        params.add("SIGN_OUT");
        System.out.println("\n\tВЫЙТИ ИЗ СИСТЕМЫ" +
                "\nВы действительно хотите выйти? (Y / N)");
        String req = in.next().toUpperCase();
        if (req.equals("Y") || req.equals("YES")) {
            processData(controller);
            mainMenu();
        } else if (req.equals("N") || req.equals("NO")) {
            secondMenu();
        } else {
            System.out.println("\nНеверный ввод данных, повторите попытку.");
            signOutMenu();
        }
    }

    public void buyTicketMenu() {

    }

    public void returnTicketMenu() {

    }

    public void seeCurrentTicketsMenu() {

    }

    public void seeTimetableMenu() {

    }

    public void changeCreditCardMenu() {

    }

    public void exitMenu() {
        System.out.println("\n\tВЫЙТИ ИЗ ПРИЛОЖЕНИЯ" +
                "\nВы действительно хотите выйти? (Y / N)");
        String req = in.next().toUpperCase();
        if (req.equals("Y") || req.equals("YES")) {
            System.exit(0);
        } else if (req.equals("N") || req.equals("NO")) {
            mainMenu();
        } else {
            System.out.println("\nНеверный ввод данных, повторите попытку.");
            exitMenu();
        }
    }
}
