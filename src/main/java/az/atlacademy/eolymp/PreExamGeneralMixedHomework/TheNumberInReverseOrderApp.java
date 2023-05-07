package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class TheNumberInReverseOrderApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long digit = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
            System.out.print(digit);
        }
    }
}
