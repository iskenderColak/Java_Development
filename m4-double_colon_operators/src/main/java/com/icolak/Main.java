package com.icolak;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        Calculate sum = (x, y) -> System.out.println(x + y);
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);

        //Reference to a Static Method
        Calculate s2 = Calculator::findSum;
        s2.calculate(10, 20);

        //Reference to a instance method
        Calculator obj = new Calculator();
        Calculate s3= obj::findMultiply;
        Calculate s4 = new Calculator()::findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> func2 = String::substring;
        System.out.println(func2.apply("iskender", 4)); // i s k e n d e r  ==> n d e r
                                                            //  0 1 2 3 4 5 6 7      4 5 6 7

    }
}
