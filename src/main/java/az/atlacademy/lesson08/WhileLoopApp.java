package az.atlacademy.lesson08;

import java.util.Scanner;

public class WhileLoopApp {
    public static void main(String[] args) {
        // 1. input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 2. process
        int count = 0;
        int sum = 0;
        int prod = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count++;
            sum += rem;
            prod *= rem;
        }
        // 3. output
        System.out.println(sum);
        System.out.println(prod);
        System.out.println(count);
    }
}
