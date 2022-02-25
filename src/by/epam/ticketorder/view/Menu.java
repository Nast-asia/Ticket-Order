package by.epam.ticketorder.view;

import by.epam.ticketorder.controller.Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // list for command parameters
    ArrayList<String> params = new ArrayList<>();
    Controller controller = new Controller();
    Scanner in = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("\n\tБРОНИРОВАНИЕ ЖД БИЛЕТОВ" +
                "\n1. Войти\n2. Зарегистрироваться\n3. Закрыть приложение");
        switch (in.next()) {
            case "1" : {
                signInMenu();
                break;
            }
            case "2" : {
                registrationMenu();
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

    public void ticketMenu() {
        System.out.println("\n\tНАВИГАЦИОННАЯ ПАНЕЛЬ" +
                "\n1. Купить билет\n2. Сдать билет\n" +
                "3. Посмотреть приобретённые билеты" + "\n4. Выйти");
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
                currentTicketsMenu();
                break;
            }
            case "4" : {
                signOutMenu();
                mainMenu();
                break;
            }
            default : {
                System.out.println("\nНеверный ввод данных, повторите попытку.");
                ticketMenu();
            }
        }
    }

    public void registrationMenu() {
        params.clear();
        params.add("REGISTRATE");
        System.out.print("\n\tРЕГИСТРАЦИОННАЯ ФОРМА" +
                "\nИмя: "); params.add(in.next());
        System.out.print("Фамилия: "); params.add(in.next());
        System.out.print("Логин: "); params.add(in.next());
        System.out.print("Пароль: "); params.add(in.next());
        System.out.print("Номер паспорта: "); params.add(in.next());
        System.out.print("Номер банковской карты: "); params.add(in.next());
        System.out.print("Счёт: "); params.add(in.next());

        controller.doAction(params);
        ticketMenu();
    }

    public void signInMenu(){
        params.clear();
        params.add("SIGN_IN");
        System.out.print("\n\tВОЙТИ В СИСТЕМУ" +
                "\nЛогин: "); params.add(in.next());
        System.out.print("Пароль: "); params.add(in.next());

        switch (controller.doAction(params)) {
            case "TICKET_MENU" : {
                ticketMenu();
            }
            case "SIGN_IN_MENU" : {
                signInMenu();
            }
        }
    }

    public void signOutMenu() {
        params.clear();
        params.add("SIGN_OUT");
        System.out.println("\n\tВЫЙТИ ИЗ СИСТЕМЫ" +
                "\nВы действительно хотите выйти? (Y / N)");
        String req = in.next().toUpperCase();
        if (req.equals("Y") || req.equals("YES")) {
            controller.doAction(params);
            params.clear();
            mainMenu();
        } else if (req.equals("N") || req.equals("NO")) {
            ticketMenu();
        } else {
            System.out.println("\nНеверный ввод данных, повторите попытку.");
            signOutMenu();
        }
    }

    public void buyTicketMenu() {

    }

    public void returnTicketMenu() {

    }

    public void currentTicketsMenu() {

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
