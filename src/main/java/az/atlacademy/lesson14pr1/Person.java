package az.atlacademy.lesson14pr1;

public class Person implements Comparable<Person> {
    private int id;
    private int age;
    private double salary;
    private String name;

    public Person(int id, int age, double salary, String name) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Person{Id=%d, age=%d, salary=%s, name='%s'}", id, age, salary, name);
    }

    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.id, that.id);
    }
}
