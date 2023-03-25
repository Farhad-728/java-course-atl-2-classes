package az.atlacademy.lesson10;

import java.util.Scanner;

public class AtLeastOneConditionOutOfTwoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 != 0) {
            System.out.println("YES");
        } else if (n > 99 && n < 1000) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
