package az.atlacademy.lesson14pr1;

public class Person implements Comparable<Person> {
    private int Id;
    private int age;
    private double salary;
    private String name;

    public Person(int id, int age, double salary, String name) {
        Id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
        return String.format("Person{Id=%d, age=%d, salary=%s, name='%s'}", Id, age, salary, name);
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.Id, person.Id);
    }
}
