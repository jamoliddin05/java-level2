package com.dmdev.oop.task;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        TimeInterval timeInterval2 = new TimeInterval(45, 50, 0);
        TimeInterval sumIntervals = timeInterval.sum(timeInterval2);
        sumIntervals.print();
    }
}
