package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class ValueOfVariable1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = (x * x * x) - (5 * x * x) / 7 + (9 * x) - (3 / x) + 1;
        System.out.printf("%.3f", y);
    }
}
