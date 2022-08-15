package com.icolak.appleTask;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(300, Color.GREEN));
        apples.add(new Apple(100, Color.RED));
        apples.add(new Apple(200, Color.GREEN));
        apples.add(new Apple(50, Color.RED));

        List<Apple> greenApple = filterApple(apples, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        List<Apple> weightApple = filterApple(apples, new AppleHeavyPredicate());
        System.out.println(weightApple);

        //ApplePredicate weightApple = apple -> apple.getWeight() > 200;


    }

    private static List<Apple> filterApple(List<Apple> apples, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
