package az.atlacademy.module01.lesson18;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    public int age;
    public double grade;
    public String name;

    public Student(int age, double grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.grade, grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, grade, name);
    }

    @Override
    public String toString() {
        return String.format("Student{age=%d, grade=%s, name='%s'}", age, grade, name);
    }
}

