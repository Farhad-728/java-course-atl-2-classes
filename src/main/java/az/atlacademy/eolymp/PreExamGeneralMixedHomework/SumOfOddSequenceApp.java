package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SumOfOddSequenceApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int n = scan.nextInt();
            for (int j = 1; j <= n; j += 2) {
                sum += j;
            }
            System.out.println(sum);
        }
    }
}