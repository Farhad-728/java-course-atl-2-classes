package az.atlacademy.lesson14pr1;

import az.atlacademy.lesson14pr1.Person;

import java.util.Comparator;

public class ComperatorPerson implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (!p1.getName().equals(p2.getName())) {
            return p2.getName().compareTo(p1.getName());
        } else if (p1.getAge() != p2.getAge()) {
            return Integer.compare(p1.getAge(),p2.getAge());
        } return Double.compare(p2.getSalary(), p1.getSalary());
    }
}