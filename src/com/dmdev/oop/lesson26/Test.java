package com.dmdev.oop.lesson26;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadExecutor = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }

            threadExecutor.submit(() -> {
                Integer counter = threadLocal.get();
                threadLocal.set(counter == null ? 1 : ++counter);
                System.out.printf("Поток %s, %d задач\n", Thread.currentThread().getName(), threadLocal.get());

                Thread.sleep(seconds * 1000L);
                System.out.printf("Поток %s спал %d секунд\n", Thread.currentThread().getName(), seconds);
                return seconds;
            });
        }

        threadExecutor.shutdown();
        threadExecutor.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
