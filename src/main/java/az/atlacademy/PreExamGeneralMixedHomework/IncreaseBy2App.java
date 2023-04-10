package az.atlacademy.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class IncreaseBy2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            for (int j = 0; j <= i; j++) {
                if (number > 0) {
                    number += 2;
                    System.out.print(n + " ");
                }
            }
        }
    }
}
