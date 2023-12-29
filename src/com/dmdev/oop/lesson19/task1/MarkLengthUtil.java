package com.dmdev.oop.lesson19.task1;

import java.util.List;
import java.util.ListIterator;

public final class MarkLengthUtil {

    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    private MarkLengthUtil() {
    }

    public static void markLength4(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String nextValue = listIterator.next();
            if (nextValue.length() == TARGET_LENGTH) {
                listIterator.set(TARGET_VALUE);
                listIterator.add(nextValue);
            }
        }
    }
}