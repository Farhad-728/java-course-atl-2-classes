package az.atlacademy.module01.lesson16pr1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue<String> cinemas = new LinkedList<>();
        cinemas.add("O Olmasin Bu Olsun");
        cinemas.add("Beyin Ogurlanmasi");
        cinemas.add("Dervish Parisi Partlatdi");
        cinemas.add("Deli Kur");

        System.out.println(cinemas);

        cinemas.offer("Ulduz");
        System.out.println(cinemas);

        cinemas.poll();
        System.out.println(cinemas);

        cinemas.remove(5);
        System.out.println(cinemas);

        cinemas.peek();
        System.out.println(cinemas);

        cinemas.clear();
        System.out.println(cinemas);

    }
}
