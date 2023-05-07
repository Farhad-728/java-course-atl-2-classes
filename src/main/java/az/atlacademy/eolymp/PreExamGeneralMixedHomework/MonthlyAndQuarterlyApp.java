package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class MonthlyAndQuarterlyApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if ((n == 1) || (n == 2) || (n == 3)) {
            System.out.println("First");
        } else if ((n == 4) || (n == 5) || (n == 6)) {
            System.out.println("Second");
        } else if ((n == 7) || (n == 8) || (n == 9)) {
            System.out.println("Third");
        } else if (n == 10 || n == 11 || n == 12) {
            System.out.println("Fourth");
        }
    }
}