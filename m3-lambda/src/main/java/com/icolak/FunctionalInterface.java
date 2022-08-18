package com.icolak;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {
        System.out.println("************PREDICATE***************");
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));

        System.out.println("************CONSUMER***************");
        Consumer<String> display = i -> System.out.println(i);
        display.accept("Consumer Interface");

        System.out.println("************BI CONSUMER***************");
        BiConsumer<Integer, String> print = (x,s) -> System.out.println(x + " kg " + s);
        print.accept(3,"Banana");

        System.out.println("************FUNCTION***************");
        Function<String, Integer> length = str -> str.length();
        System.out.println(length.apply("Java Developer"));



    }
}
