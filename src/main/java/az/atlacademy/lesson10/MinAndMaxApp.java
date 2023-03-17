package az.atlacademy.lesson10;

import java.util.Scanner;

public class MinAndMaxApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > b) {
            System.out.print(b + " " + a);
        } else if (b > a) {
            System.out.println(a + " " + b);
        }
    }
}
