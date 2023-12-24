package com.dmdev.oop.lesson11;

public class Computer {
    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void load() {
        System.out.println("Я загрузился");
    }
}
