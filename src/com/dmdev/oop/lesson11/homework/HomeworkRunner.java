package com.dmdev.oop.lesson11.homework;

public class HomeworkRunner {
    public static void main(String[] args) {
        Point leftTop = new Point(-1, 3);
        Point rightBottom = new Point(6, 2);
        Rectangle rectangle = new Rectangle(leftTop, rightBottom);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateDiagonal());
    }
}
