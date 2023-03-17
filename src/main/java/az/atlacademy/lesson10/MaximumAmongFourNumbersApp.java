package az.atlacademy.lesson10;

import java.util.Scanner;

public class MaximumAmongFourNumbersApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println(a);
                } else {
                    System.out.println(d);
                }
            }
        } else if (b > c) {
            if (b > d) {
                System.out.println(b);
            } else {
                System.out.println(d);
            }
        } else if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}