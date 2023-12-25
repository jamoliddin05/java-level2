package com.dmdev.oop.hometask.shapes.rectangles;

import com.dmdev.oop.hometask.shapes.abstractions.RectangularShape;
import com.dmdev.oop.lesson11.homework.Point;

public class Rectangle extends RectangularShape {
    public Rectangle(Point topLeft, Point rightBottom) {
        super(topLeft, rightBottom);
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}
