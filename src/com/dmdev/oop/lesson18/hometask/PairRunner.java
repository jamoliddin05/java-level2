package com.dmdev.oop.lesson18.hometask;

import com.dmdev.oop.lesson18.hometask.util.PairUtil;

public class PairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("111a", 222);
        System.out.println(pair);

        Pair<Integer, String> swappedPair = PairUtil.swap(pair);
        System.out.println(swappedPair);
    }
}
