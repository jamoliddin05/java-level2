package com.dmdev.oop.lesson11.homework;

public class Rectangle {
    private Point leftTop;
    private Point rightBottom;
    private Point tempPoint;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
        tempPoint = new Point(leftTop.getX(), rightBottom.getY());
    }

    public double calculateArea() {
        return leftTop.distance(tempPoint) * rightBottom.distance(tempPoint);
    }

    public double calculateDiagonal() {
        return leftTop.distance(rightBottom);
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }
}
