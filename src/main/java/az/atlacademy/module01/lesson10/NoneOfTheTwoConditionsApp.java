package az.atlacademy.module01.lesson10;

import java.util.Scanner;

public class NoneOfTheTwoConditionsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 && n > 0) {
            System.out.println("NO");
        } else if (n % 2 != 0 && n < 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
