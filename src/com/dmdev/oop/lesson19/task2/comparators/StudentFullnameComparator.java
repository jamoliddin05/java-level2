package com.dmdev.oop.lesson19.task2.comparators;

import com.dmdev.oop.lesson19.task2.Student;

import java.util.Comparator;

public class StudentFullnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        return student.getFullName().compareTo(t1.getFullName());
    }
}
