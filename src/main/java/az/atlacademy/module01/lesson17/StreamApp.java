package az.atlacademy.module01.lesson17;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamApp {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Elvin");
        words.add("Samir");
        words.add("Ilqar");
        words.add("Orkhan");
        words
                .stream()
                .forEach(System.out::println);
        words
                .stream()
                .map(word -> word.length())
                .forEach(System.out::println);

        words
                .stream()
                .filter(word -> word.length() > 3)
                .forEach(System.out::println);

        int sum = words
                .stream()
                .filter(word -> word.length() > 3)
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }
}
