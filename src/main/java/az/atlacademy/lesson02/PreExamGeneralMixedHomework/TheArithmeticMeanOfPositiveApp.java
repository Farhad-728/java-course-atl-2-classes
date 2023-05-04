package az.atlacademy.lesson02.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class TheArithmeticMeanOfPositiveApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] numbers = new double[size];
        int count = 0;
        double average = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextDouble();
            if (numbers[i] > 0) {
                count++;
                average += numbers[i];
            }
        }
        if (count == 0) {
            System.out.println("Not Found");
        } else {
            System.out.printf("%.2f", (average / count));
        }
    }
}
