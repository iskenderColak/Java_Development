package com.icolak.orangeTask;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange(300,Color.YELLOW ));
        oranges.add(new Orange(100, Color.GREEN));
        oranges.add(new Orange(200, Color.YELLOW));
        oranges.add(new Orange(50, Color.GREEN));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintOrange(oranges, orangeLambda);

        OrangeFormatter fancyFormatter = orange -> {
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A " + ch + " " + orange.getColor() + " orange";
        };
        prettyPrintOrange(oranges, fancyFormatter );


    }

    private static void prettyPrintOrange(List<Orange> oranges, OrangeFormatter p) {
        for (Orange orange : oranges) {
            String output = p.accept(orange);
            System.out.println(output);
        }
    }
}
