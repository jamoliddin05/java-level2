package com.dmdev.oop.hometask.point;

public class Point {
    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(com.dmdev.oop.lesson11.homework.Point target) {
        return Math.sqrt(
                Math.pow(target.getX() - x, 2) + Math.pow(target.getY() - y, 2)
        );
    }

    @Override
    public String toString() {
        return "Point{" +
               "x=" + x +
               ", y=" + y +
               '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
