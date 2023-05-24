package az.atlacademy.module01.lesson08;

import java.util.Scanner;

public class WhileApp {
    public static void main(String[] args) {

        // 1. input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 2.process(output)
        while (true) {
            System.out.println(num);
            if (num > 0) {
                int rem = num % 10;
                num /= 10;
                System.out.println(rem);
                break;
            }

        }
    }
}
