package com.dmdev.oop.lesson20;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Tester extends Exception {

    public static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new FileNotFoundException(),
            1, new Exception(),
            2, new RuntimeException()
    );

    public static void main(String[] args) {
        Random random = new Random();
        try {
            tester(random.nextInt(3));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static void tester(int random) throws Throwable {
        throw EXCEPTIONS.getOrDefault(random, new Throwable());
    }
}
