import by.epam.ticketorder.controller.Controller;

import java.util.ArrayList;

public class Initialization {
    public static void init() {
        // list for command parameters
        ArrayList<String> params = new ArrayList<>();
        Controller controller = new Controller();

        params.add("INIT");
        params.add("Nast.asia");
        params.add("123456");
        params.add("Nastasia");
        params.add("Nazarevich");
        params.add("KB654321");
        params.add("1234 1234 1234 1234");
        params.add("54.75");

        System.out.println(controller.doAction(params));
        params.clear();
    }
}
