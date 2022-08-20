package com.icolak;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    //Creating Stream from Array
    String[] courses = {"Java", "Spring", "Agile"};

    Stream<String> courseStream = Arrays.stream(courses);

    //Creating Strewam from collection
    List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
    Stream<String> courseStream2 = courseList.stream();

    List<Course> myCourses = Arrays.asList(
            new Course("Java", 100),
            new Course("DS", 101),
            new Course("MS", 102)
    );

    Stream<Course> myCourseStream = myCourses.stream();

    //Creating Stream Values
    Stream<Integer> numberOfStream = Stream.of(1, 2, 3, 4);

}
