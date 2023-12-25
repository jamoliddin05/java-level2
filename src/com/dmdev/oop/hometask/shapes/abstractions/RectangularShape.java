package com.dmdev.oop.hometask.shapes.abstractions;

import com.dmdev.oop.hometask.shapes.abstractions.Shape;
import com.dmdev.oop.lesson11.homework.Point;

public abstract class RectangularShape extends Shape {
    private Point topLeft;
    private Point rightBottom;
    private Point tempPoint;

    public RectangularShape(Point topLeft, Point rightBottom) {
        this.topLeft = topLeft;
        this.rightBottom = rightBottom;
    }

    public double diagonal(Point topLeft, Point rightBottom) {
        return topLeft.distance(rightBottom);
    }

    @Override
    public double area() {
        return topLeft.distance(getTempPoint()) * rightBottom.distance(getTempPoint());
    }

    private Point getTempPoint() {
        return new Point(topLeft.getX(), rightBottom.getY());
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getRightBottom() {
        return rightBottom;
    }
}
