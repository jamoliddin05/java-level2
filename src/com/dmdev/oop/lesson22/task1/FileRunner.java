package com.dmdev.oop.lesson22.task1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class FileRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "file.txt");

        Map<Character, Integer> map = CharacterHelper.calcFrequency(path);
        List<String> result = CharacterHelper.toListRepresentation(map);

        result.forEach(System.out::println);
    }
}
