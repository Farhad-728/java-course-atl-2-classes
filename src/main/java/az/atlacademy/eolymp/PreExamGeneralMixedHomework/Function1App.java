package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class Function1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            double fX = (Math.pow(x, 3) + (2 * Math.pow(x, 2) - 3));
            System.out.printf("%.4f\n", fX);
        }
        scan.close();
    }
}
