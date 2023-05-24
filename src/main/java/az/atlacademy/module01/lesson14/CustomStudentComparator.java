package az.atlacademy.module01.lesson14;

import java.util.Comparator;

public class CustomStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGrade() != s2.getGrade()) {
            return Double.compare(s2.getGrade(), s1.getGrade());
        } else if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        }
        return s1.compareTo(s2);
    }
}
