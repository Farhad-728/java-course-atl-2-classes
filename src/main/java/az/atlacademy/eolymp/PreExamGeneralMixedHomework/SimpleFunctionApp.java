package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SimpleFunctionApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double fX = x + Math.sin(x);
        System.out.printf("%.4f", fX);
    }
}
