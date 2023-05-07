package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class Function3App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double fXy = Math.pow(x, 2) + Math.sin(x * y) - Math.pow(y, 2);
            System.out.printf("%.4f\n", fXy);
        }
        scan.close();
    }
}
