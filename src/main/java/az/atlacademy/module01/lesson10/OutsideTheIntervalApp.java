package az.atlacademy.module01.lesson10;

import java.util.Scanner;

public class OutsideTheIntervalApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (x >= a && x <= b) {
            System.out.println("IN");
        } else {
            System.out.println("OUT");
        }
    }
}
