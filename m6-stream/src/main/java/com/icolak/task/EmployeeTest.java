package com.icolak.task;


import java.util.List;

import static com.icolak.task.EmployeeData.readAll;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("Print All Emails");
        readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers");
        readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        System.out.println("FLAT MAP Print All Phone Numbers");
        readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("FLAT MAP Double Colon Print All Phone Numbers");
        readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
