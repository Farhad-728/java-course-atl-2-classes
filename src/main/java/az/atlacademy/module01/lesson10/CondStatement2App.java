package az.atlacademy.module01.lesson10;

import java.util.Scanner;

public class CondStatement2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x < 10) {
            int y = (x * x) - (2 * x) + 4;
            System.out.println(y);
        } else if (x >= 10) {
            int y = (x * x * x) + (5 * x);
            System.out.println(y);
        }
    }
}

