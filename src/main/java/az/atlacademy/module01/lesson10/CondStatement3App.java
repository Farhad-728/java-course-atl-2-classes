package az.atlacademy.module01.lesson10;

import java.util.Scanner;

public class CondStatement3App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x < -4) {
            int y = x + 5;
            System.out.println(y);
        } else if (x >= -4 && x <= 7) {
            int y = (x * x) - (3 * x);
            System.out.println(y);
        } else if (x > 7) {
            int y = (x * x * x) + (2 * x);
            System.out.println(y);
        }
    }
}
