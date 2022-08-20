package com.icolak;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 5, 20);
        System.out.println(list);

        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Descending
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        System.out.println("=============================");
        Collections.sort(list, ((o1, o2) -> (o1 < o2) ? 1 : (o1 > o2) ? -1 : 0));
        System.out.println(list);

        System.out.println("=============Ascending=============");
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println("Ascending compareto: " + list);
        list.sort(Integer::compareTo);
        System.out.println("Ascending double colon: " + list);

        System.out.println("=============Descending=============");
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println("Decending compareto: " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("Comparator.reverseOrder(): " + list);

        List<String> strList = Arrays.asList("Ali", "Veli", "Hasan", "Osman");
        strList.sort(Comparator.reverseOrder());
        System.out.println("Comparator.reverseOrder(): " + strList);
        strList.sort(String::compareTo);
        System.out.println("str sorted: " + strList);


    }
}
