package com.dmdev.oop.lesson19.task2;

import java.util.List;

public final class StudentHelper {

    private StudentHelper() {
    }

    public static Student getTheBestStudent(List<Student> students) {
        Student theBestStudent = null;
        for (Student student : students) {
            if (theBestStudent == null || theBestStudent.getAverageMark() < student.getAverageMark()) {
                theBestStudent = student;
            }
        }
        return theBestStudent;
    }
}
