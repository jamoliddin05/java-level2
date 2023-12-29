package com.dmdev.oop.lesson21;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class LambdaExample {

    public static void main(String[] args) {
//        first task
//        List<Integer> integers = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);
//        integers.stream()
//                .filter(x -> x % 2 != 0)
//                .filter(x -> x % 5 == 0)
//                .mapToInt(Integer::intValue)
//                .average()
//                .ifPresent(System.out::println);

//        second task
//        List<String> strings = List.of(
//                "string-1",
//                "string-2",
//                "string-3",
//                "string-4",
//                "string-10",
//                "string-10",
//                "string-10",
//                "string-12",
//                "string-16"
//        );
//
//        long result = strings.stream()
//                .filter(s -> s.length() > 8)
//                .distinct()
//                .count();
//
//        System.out.println(result);

//        third task
//        Map<String, Integer> map = Map.of(
//                "string1", 1,
//                "strin2", 2,
//                "string3", 3,
//                "string4", 5,
//                "strin5", 5
//        );
//
//        int result = map.entrySet().stream()
//                .filter(e -> e.getKey().length() < 7)
//                .mapToInt(Map.Entry::getValue)
//                .sum();
//
//        System.out.println(result);

//        fourth task
//        List<Integer> integers = List.of(5, 2, 4, 2, 1);
//        String result = integers.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
//        System.out.println(result);

        List<Person> people = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov", 56)
        );
//
//        people.stream()
//                .filter(p -> p.getFullName().length() < 15)
//                .max(Comparator.comparing(Person::getAge))
//                .map(Person::getFullName)
//                .ifPresent(System.out::println);

        Map<Integer, List<String>> map = people.stream()
                .collect(groupingBy(Person::getAge,
                         mapping(Person::getFullName, toList())));
        System.out.println(map);
    }
}
