package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class Function2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            double fX = Math.sqrt(x) +(2 * x) + Math.sin(x);
            System.out.printf("%.4f\n", fX );
        }
        scan.close();
    }
}