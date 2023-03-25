package az.atlacademy.lesson10;

import java.util.Scanner;

public class DivisibilityByDigitsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n1 = num % 10;
        int n2 = (num / 10) % 10;
        int n3 = (num / 100) % 10;
        int n4 = num / 1000;

        if (num % n1 == 0 && num % n2 == 0 && num % n3 == 0 && num % n4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


