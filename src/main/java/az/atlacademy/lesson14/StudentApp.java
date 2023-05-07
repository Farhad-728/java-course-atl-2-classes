package az.atlacademy.lesson14;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, 78.5, "Elvin"),
                new Student(2, 79.0, "Samir"),
                new Student(1, 78.0, "Ilqar"),
                new Student(5, 77.0, "Murad")
        };
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new CustomStudentComparator());
        System.out.println(Arrays.toString(students));
    }
}
