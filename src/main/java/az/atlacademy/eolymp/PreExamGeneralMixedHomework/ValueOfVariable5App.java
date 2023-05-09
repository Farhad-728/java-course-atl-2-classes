package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class ValueOfVariable5App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double x1 = (2 * x) / (Math.sqrt(Math.pow(x, 2) + 1));
        double x2 = Math.sqrt(Math.pow(x, 2) + 1) / Math.pow(x, 3);
        double y = x1 - x2;
        System.out.printf("%.3f", y);
    }
}
