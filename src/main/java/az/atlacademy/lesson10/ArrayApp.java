package az.atlacademy.lesson10;

public class ArrayApp {
    public static void main(String[] args) {
        double[] grades = new double[8];
        grades[0] = 100.0;
        grades[1] = 100.0;
        grades[2] = 100.0;
        grades[3] = 100.0;
        grades[4] = 222.2;
        grades[5] = 100.0;
        grades[6] = 100.0;
        grades[7] = 100.0;

        System.out.println(grades[4]);
        System.out.println(grades[6] - 10);
    }
}
