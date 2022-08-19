package com.icolak.userTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith"));
        users.add(new User("Tom", "Evan"));
        users.add(new User("Emma", "Pollard"));

        printName(users, user -> true);
        System.out.println("=============StartsWith::'E'=========================");
        printName(users, user -> user.getLastname().startsWith("E"));

        System.out.println("===============lambda=============");
        Consumer<User> prnt = user -> System.out.println(user);
        for (User user : users) {
            prnt.accept(user);
        }

    }



    private static void printName(List<User> users, Predicate<User> p) {
        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user.toString());
            }
        }
    }
}
