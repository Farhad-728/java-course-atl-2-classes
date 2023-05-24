package az.atlacademy.module01.lesson08;

import java.util.Scanner;

public class WhileLoopApp {
    public static void main(String[] args) {
        // 1. input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 2. process
        int count = 0;
        int sum = 0;
        int prod = 1;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count++;
            sum += rem;
            prod *= rem;
        }

        // 3. output
        System.out.printf("Sum of digits is: %d\n", sum);
        System.out.printf("Prod of digits is: %d\n", prod);
        System.out.printf("Count of digits is: %d\n", count);
    }
}
