package com.dmdev.oop.lesson18;

import java.util.HashMap;
import java.util.Map;

public class ListRunner {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Hey");

        for (Map.Entry<Integer, String> something : map.entrySet()) {
            System.out.println(something.getKey() + " " + something.getValue());
        }
    }
}
