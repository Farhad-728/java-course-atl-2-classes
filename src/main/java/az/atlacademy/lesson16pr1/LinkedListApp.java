package az.atlacademy.lesson16pr1;

import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Elvin");
        name.add("Samir");
        name.add("Ilqar");
        name.add("Nizami");
        System.out.println(name);

        name.addFirst("Surxay");
        System.out.println(name);

        name.addLast("Orkhan");
        System.out.println(name);

        System.out.println(name.getFirst());

        System.out.println(name.getLast());

        name.clear();
        System.out.println(name);
    }
}
