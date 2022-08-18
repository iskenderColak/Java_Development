package com.icolak;

import java.util.function.*;

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
        System.out.println(length.apply("Java Developer")); // 14

        Function<String, String> evenIndex = str -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    builder.append(str.charAt(i));
                }
            }
            return builder.toString();
        };
        System.out.println(evenIndex.apply("It returns even index char String"));
                                                                        // I eun vnidxca tig


        System.out.println("************BI FUNCTION***************");
        BiFunction<String, Integer, Character> nThIndex = (str, i) -> str.charAt(i);
        System.out.println(nThIndex.apply("Java Developer", 0)); // J

        System.out.println("************SUPPLIER***************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Supplier<Boolean> isTrue = () -> true;
        System.out.println(isTrue.get());







    }
}
