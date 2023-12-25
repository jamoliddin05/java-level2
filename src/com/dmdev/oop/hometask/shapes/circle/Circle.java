package com.dmdev.oop.hometask.shapes.circle;

import com.dmdev.oop.hometask.shapes.abstractions.Shape;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
               "radius=" + radius +
               '}';
    }
}
