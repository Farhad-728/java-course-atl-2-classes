package az.atlacademy.module01.lesson10;

import java.util.Scanner;

public class DoubleApp {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double n = num.nextDouble();
        System.out.printf("%.2f", n);
    }
}
