package com.icolak.memberTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("mike",35,Gender.MALE);
        Person p2 = new Person("ozzy",25,Gender.MALE);
        Person p3 = new Person("tom",15,Gender.MALE);
        Person p4 = new Person("ally",45,Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        CheckPerson checkPerson = person -> person.getGender().equals(Gender.MALE) &&
                person.getAge() >= 18 && person.getAge() <= 25;
        print(personList, checkPerson);

    }

    private static void print(List<Person> personList, CheckPerson checkPerson) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (checkPerson.test(person)) {
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
