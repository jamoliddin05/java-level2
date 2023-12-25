package com.dmdev.oop.hometask.shapes.triangle;

import com.dmdev.oop.hometask.point.Point;
import com.dmdev.oop.hometask.shapes.abstractions.Shape;

public class Triangle extends Shape {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(point1.getX() * (point2.getY() - point3.getY()) +
                              point2.getX() * (point3.getY() - point1.getY()) +
                              point3.getX() * (point1.getY() - point2.getY()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
               "point1=" + point1 +
               ", point2=" + point2 +
               ", point3=" + point3 +
               '}';
    }
}
