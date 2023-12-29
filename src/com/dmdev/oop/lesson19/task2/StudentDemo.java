package com.dmdev.oop.lesson19.task2;

import com.dmdev.oop.lesson19.task2.comparators.StudentAgeComparator;
import com.dmdev.oop.lesson19.task2.comparators.StudentFullnameComparator;
import com.dmdev.oop.lesson19.task2.comparators.StudentMarkComparator;

import java.util.Arrays;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", 33, 5.4),
                new Student("Ivan", "Ivanov", 20, 9.7),
                new Student("Sveta", "Svetikova", 18, 7.2),
                new Student("Petr", "Petrov", 25, 8.5),
                new Student("Petr", "Petrov", 25, 8.9),
                new Student("Mike", "Glotov", 31, 6.6)
        );

        System.out.println(StudentHelper.getTheBestStudent(students));

        System.out.println();

        students.sort(new StudentFullnameComparator());
        System.out.println(students);

        System.out.println();

        students.sort(new StudentAgeComparator());
        System.out.println(students);

        System.out.println();

        students.sort(new StudentMarkComparator());
        System.out.println(students);
    }
}
