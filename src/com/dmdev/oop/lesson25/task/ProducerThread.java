package com.dmdev.oop.lesson25.task;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            list.add(RandomUtil.getRandom());
        }
    }
}
