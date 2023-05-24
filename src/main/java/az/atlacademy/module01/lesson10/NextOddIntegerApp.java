package az.atlacademy.module01.lesson10;

import java.util.Scanner;

public class NextOddIntegerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if ((n - 1) % 2 != 0) {
            System.out.println(n + 1);
        } else if ((n - 2) % 2 != 0) {
            System.out.println(n + 2);
        }
    }
}
