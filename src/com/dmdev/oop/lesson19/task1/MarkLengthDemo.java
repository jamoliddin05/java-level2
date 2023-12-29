package com.dmdev.oop.lesson19.task1;

import java.util.LinkedList;
import java.util.List;

public class MarkLengthDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        MarkLengthUtil.markLength4(list);
        System.out.println(list);
    }
}
