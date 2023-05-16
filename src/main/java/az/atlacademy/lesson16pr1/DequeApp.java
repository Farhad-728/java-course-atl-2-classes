package az.atlacademy.lesson16pr1;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

    public static void main(String[] args) {
        Deque<String> words = new LinkedList<>();
        words.add("Book");
        words.add("Cut");
        words.add("Table");
        words.add("Java");
        words.add("Python");
        System.out.println(words);

        words.pop();
        System.out.println(words);

        words.offerFirst("Printer");
        System.out.println(words);

        words.addLast("Linux");
        System.out.println(words);

        words.addFirst("Display");;
        System.out.println(words);

        words.offer(String.valueOf(words.isEmpty()));
        System.out.println(words);
    }
}
