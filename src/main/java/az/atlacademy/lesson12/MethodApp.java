package az.atlacademy.lesson12;

import java.util.Scanner;

public class MethodApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printDigits(n);
    }

    public static void printDigits(int a) {
        while (a > 0) {
            System.out.println(a % 10 + " ");
            a /= 10;
        }
    }
}
