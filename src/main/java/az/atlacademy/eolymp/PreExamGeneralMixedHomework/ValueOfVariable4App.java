package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class ValueOfVariable4App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double x1 = ((2 * x) - 1) / Math.pow(x, 2);
        double x2 = (Math.sqrt(Math.pow(x, 2) + 1) / 2);
        double y = x1 + x2;
        System.out.printf("%.3f", y);
    }
}