package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class TheRratioOfProductToTheSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        double prod = 1;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            prod *= digit;
            sum += digit;
            n /= 10;
        }
        System.out.printf("%.3f", (prod / sum));
    }
}
