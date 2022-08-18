package com.icolak;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {
        System.out.println("************PREDICATE***************");
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));

        System.out.println("************CONSUMER***************");
        Consumer<String> display = i -> System.out.println(i);
        display.accept("Consumer Interface");

    }
}
