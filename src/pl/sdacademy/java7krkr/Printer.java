package pl.sdacademy.java7krkr;

import java.util.LinkedList;
import java.util.List;

public class Printer {

    public static void main(String[] args) {

        List<User> users =  new LinkedList<User>();
        User developer = new Developer();
        User admin = new Admin();
        User guest = new Guest();

        users.add(developer);
        users.add(admin);
        users.add(guest);

        for (User user : users) {
            user.printMyRole();
        }
    }
}
