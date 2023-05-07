package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class TheLastDigitApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int digit = 0;
        digit = (int) (n % 10);
        System.out.println(digit);
    }
}
