package com.dmdev.oop.lesson19.task2;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageMark;

    public Student(String name, String surname, int age, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age=" + age +
               ", averageMark=" + averageMark +
               '}';
    }
}
