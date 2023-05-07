package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double sum = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.printf("%.3f", Math.sqrt(sum));
    }
}
