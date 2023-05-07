package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class FindTheSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
             sum += 1 / (i * (i + 1));
        }
        System.out.printf("%.6f", sum);
    }
}
