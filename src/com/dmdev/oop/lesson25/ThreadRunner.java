package com.dmdev.oop.lesson25;

public class ThreadRunner {

    public static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("Flag is still false");
            }
        });

        thread1.start();

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("Flag is set");
        });

        thread2.start();
    }
}
