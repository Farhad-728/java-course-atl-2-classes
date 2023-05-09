package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class ValueOfVariable2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double local1 = (Math.pow(x, 2) + 4) / 2;
        double local2 = 3 / (x + 7);
        double y = x - local1 + Math.pow(x, 3) - local2;
        System.out.printf("%.3f", y);
    }
}
