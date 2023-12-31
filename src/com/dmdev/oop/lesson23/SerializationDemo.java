package com.dmdev.oop.lesson23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "student.out");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person = new Person(26, "Sergey");
            outputStream.writeObject(person);
        }
    }
}
