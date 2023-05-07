package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SumOfElementsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] array = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextDouble();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
