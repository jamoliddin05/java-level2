package com.dmdev.oop.hometask.runner;

import com.dmdev.oop.hometask.shapes.abstractions.Shape;
import com.dmdev.oop.hometask.shapes.circle.Circle;
import com.dmdev.oop.hometask.shapes.rectangles.Rectangle;
import com.dmdev.oop.hometask.shapes.rectangles.Square;
import com.dmdev.oop.lesson11.homework.Point;

public class HometaskRunner {
    public static void main(String[] args) {
        Shape square = new Square(new Point(1, 5), new Point(5, 1));
        Shape rectangle = new Rectangle(new Point(0, 2), new Point(8, 0));
        Shape circle = new Circle(4);

        System.out.println(square.isAreaEqual(rectangle));
        System.out.println(square.isAreaEqual(circle));
    }
}
