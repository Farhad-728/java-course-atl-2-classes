package az.atlacademy.lesson10;

import java.util.Scanner;

public class ExactlyOneConditionOutOfTwoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 || (n < 0 && n % 3 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
