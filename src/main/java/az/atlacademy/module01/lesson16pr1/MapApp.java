package az.atlacademy.module01.lesson16pr1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MapApp {

    public static void main(String[] args) {
        HashMap<Integer, Queue<String>> foods = new HashMap<>();
        Queue<String> wolt = new LinkedList<>();
        wolt.add("Doner");
        wolt.add("Ayran");
        foods.put(1, wolt);

        Queue<String> kfc = new LinkedList<>();
        kfc.add("Toyuq");
        kfc.add("Cola");
        foods.put(2, kfc);

        System.out.println(foods);
     }
}
