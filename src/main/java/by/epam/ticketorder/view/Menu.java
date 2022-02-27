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
        System.out.println("\n\tБРОНИРОВАНИЕ ЖД БИЛЕТОВ");
        System.out.println("1. Войти\n2. Зарегистрироваться\n3. Закрыть приложение");
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
                break;
            }
        }
    }

    public void ticketMenu() {
        System.out.println("\n\tНАВИГАЦИОННАЯ ПАНЕЛЬ");
        System.out.println("1. Купить билет\n2. Сдать билет\n" +
                "3. Посмотреть приобретённые билеты" + "\n4. Выйти");
        switch (in.next()) {
            case "1" : {
                seeTimetableMenu();
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
                signOutMenu();
                mainMenu();
                break;
            }
            default : {
                System.out.println("\nНеверный ввод данных, повторите попытку.");
                ticketMenu();
                break;
            }
        }
    }

    public void registrationMenu() {
        params.clear();
        params.add("REGISTRATE");
        System.out.println("\n\tРЕГИСТРАЦИОННАЯ ФОРМА");
        System.out.print("Имя: "); params.add(in.next());
        System.out.print("Фамилия: "); params.add(in.next());
        System.out.print("Номер паспорта: "); params.add(in.next());
        System.out.print("Номер банковской карты: "); params.add(in.next());
        System.out.print("Счёт: "); params.add(in.next());
        System.out.print("Логин: "); params.add(in.next());
        System.out.print("Пароль: "); params.add(in.next());

        boolean wrongLogin = true;
        while(wrongLogin) {
            switch(controller.doAction(params)) {
                case "TICKET_MENU" : {
                    System.out.println("\nРегистрация прошла успешно.");
                    ticketMenu();
                    wrongLogin = false;
                    break;
                }
                case "WRONG_REQUEST" : {
                    System.out.println("\nЛогин уже существует, введите другое значение.");
                    System.out.print("Логин: "); params.set(6, in.next());
                    break;
                }
                default: {
                    System.out.println("\nНепредвиденный сбой системы...");
                    break;
                }
            }
        }
    }

    public void signInMenu() {
        params.clear();
        params.add("SIGN_IN");
        System.out.println("\n\tВОЙТИ В СИСТЕМУ");
        System.out.print("Логин: "); params.add(in.next());
        System.out.print("Пароль: "); params.add(in.next());

        switch (controller.doAction(params)) {
            case "TICKET_MENU" : {
                System.out.println("\nВы вошли в систему.");
                ticketMenu();
                break;
            }
            case "SIGN_IN_MENU" : {
                System.out.println("\nНеверный логин или пароль.");
                signInMenu();
                break;
            }
            default: {
                System.out.println("\nНепредвиденный сбой системы...");
                break;
            }
        }
    }

    public void signOutMenu() {
        params.clear();
        params.add("SIGN_OUT");
        System.out.println("\n\tВЫЙТИ ИЗ СИСТЕМЫ");
        System.out.println("Вы действительно хотите выйти? (Y / N)");
        String req = in.next().toUpperCase();
        if (req.equals("Y") || req.equals("YES")) {
            System.out.println(controller.doAction(params));
            params.clear();
            mainMenu();
        } else if (req.equals("N") || req.equals("NO")) {
            ticketMenu();
        } else {
            System.out.println("\nНеверный ввод данных, повторите попытку.");
            signOutMenu();
        }
    }

    public void seeTimetableMenu() {
        params.clear();
        params.add("SEE_TIMETABLE");
        System.out.println("\n\tВЫБОР МАРШРУТА");
        System.out.print("Пункт отправления: "); params.add(in.next());
        System.out.print("Пункт прибытия: "); params.add(in.next());
        System.out.print("Дата (DD.MM.HH): "); params.add(in.next());

        switch (controller.doAction(params)) {
            case "BUY_TICKET_MENU" : {
                buyTicketMenu(params);
                break;
            }
            case "SEE_TIMETABLE_MENU" : {
                System.out.println("\nПо указанному маршруту поездов нет." +
                        "\nЖелаете выбрать другой? (Y / N)");
                do {
                    String req = in.next().toUpperCase();
                    if (req.equals("Y") || req.equals("YES")) {
                        seeTimetableMenu();
                        break;
                    } else if (req.equals("N") || req.equals("NO")) {
                        ticketMenu();
                        break;
                    } else {
                        System.out.println("\nНеверный ввод данных, повторите попытку.");
                    }
                } while (true);
                break;
            }
            default: {
                System.out.println("\nНепредвиденный сбой системы...");
                break;
            }
        }
    }

    public void buyTicketMenu(ArrayList<String> params) {
        params.remove(0);
        params.add(0, "BUY_TICKET");
        System.out.println("\n\tВЫБОР ПОЕЗДА");
        System.out.print("Время отправления: "); params.add(in.next());
        switch (controller.doAction(params)) {
            case "BUY_TICKET_MENU" : {
                System.out.println("\nК сожалению, вам отказано в покупке билета.");
                System.out.println("\nЖелаете попробовать еще раз? (Y / N)");
                do {
                    String req = in.next().toUpperCase();
                    if (req.equals("Y") || req.equals("YES")) {
                        buyTicketMenu(params);
                        break;
                    } else if (req.equals("N") || req.equals("NO")) {
                        ticketMenu();
                        break;
                    } else {
                        System.out.println("\nНеверный ввод данных, повторите попытку.");
                    }
                } while (true);
                break;
            }
            case "SEE_CURRENT_TICKETS_MENU" : {
                System.out.println("\nВы успешно приобрели билет.");
                seeCurrentTicketsMenu();
                break;
            }
            default: {
                System.out.println("\nНепредвиденный сбой системы...");
                break;
            }
        }
    }

    public void returnTicketMenu() {

    }

    public void seeCurrentTicketsMenu() {

    }

    public void exitMenu() {
        System.out.println("\n\tВЫЙТИ ИЗ ПРИЛОЖЕНИЯ");
        System.out.println("Вы действительно хотите выйти? (Y / N)");
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
