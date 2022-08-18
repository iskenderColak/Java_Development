package com.icolak;

import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {
        System.out.println("************PREDICATE***************");
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));
    }
}
