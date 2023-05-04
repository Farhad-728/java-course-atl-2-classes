package az.atlacademy.lesson02.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class IncreaseBy2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            if (number >= 0) {
                number += 2;
                System.out.print(number + " ");
            } else {
                System.out.print(number + " ");
            }
        }
    }
}
