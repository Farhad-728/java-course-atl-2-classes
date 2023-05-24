package az.atlacademy.module01.lesson16pr1;

import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Elvin");
        names.add("Samir");
        names.add("Ilqar");
        names.add("Nizami");
        System.out.println(names);

        names.addFirst("Surxay");
        System.out.println(names);

        names.addLast("Orkhan");
        System.out.println(names);

        System.out.println(names.getFirst());

        System.out.println(names.getLast());

        names.clear();
        System.out.println(names);
    }
}
