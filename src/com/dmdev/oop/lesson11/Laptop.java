package com.dmdev.oop.lesson11;

public class Laptop extends Computer{

    public Laptop(Ram ram, Ssd ssd) {
        super(ram, ssd);
        System.out.println("I'm a laptop");
    }

    public Laptop() {
    }
}
