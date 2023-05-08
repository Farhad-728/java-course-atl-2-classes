package lesson13pr1;

import az.atlacademy.lesson14pr1.Person;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person(1,25,750,"Samir"),
                new Person(2,27,800,"Elvin"),
                new Person(3, 35, 750, "Ilqar"),
                new Person(4, 33,950,"Nizami"),
        };
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons, new ComperatorPerson());
        System.out.println(Arrays.toString(persons));
    }
}
