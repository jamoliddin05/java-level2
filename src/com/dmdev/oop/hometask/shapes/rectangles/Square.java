package com.dmdev.oop.hometask.shapes.rectangles;

import com.dmdev.oop.hometask.shapes.abstractions.RectangularShape;
import com.dmdev.oop.lesson11.homework.Point;

public class Square extends RectangularShape {
    public Square(Point topLeft, Point rightBottom) {
        super(topLeft, rightBottom);
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
