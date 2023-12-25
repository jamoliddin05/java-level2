package com.dmdev.oop.hometask.shapes.util;

import com.dmdev.oop.hometask.shapes.abstractions.Shape;
import com.dmdev.oop.hometask.shapes.circle.Circle;
import com.dmdev.oop.hometask.shapes.rectangles.Rectangle;
import com.dmdev.oop.hometask.shapes.rectangles.Square;

public class ShapeUtil {
    public static String whatShape(Shape shape) {
        return switch (shape) {
            case Rectangle rectangle -> "It's a rectangle";
            case Square square -> "It's a square";
            case Circle circle -> "It's a circle";
            case null, default -> "It's a triangle";
        };
    }
}
