package com.dmdev.oop.lesson19.collections;

import java.util.HashMap;
import java.util.Map;

public final class WordUtil {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    private WordUtil() {
    }

    public static Map<String, Integer> calcWordFrequency(String text) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] words = text
                .replace(".", EMPTY)
                .replace(",", EMPTY)
                .replace("!", EMPTY)
                .split(SPACE);

        for (String word : words) {
            Integer oldCount = resultMap.get(word);
            Integer newCount = oldCount == null ? 1 : oldCount + 1;
            resultMap.put(word, newCount);
        }

        return resultMap;
    }
}
