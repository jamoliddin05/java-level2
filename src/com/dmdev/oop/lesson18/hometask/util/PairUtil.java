package com.dmdev.oop.lesson18.hometask.util;

import com.dmdev.oop.lesson18.hometask.Pair;

public final class PairUtil {
    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> source) {
        return new Pair<>(source.getSecond(), source.getFirst());
    }
}
