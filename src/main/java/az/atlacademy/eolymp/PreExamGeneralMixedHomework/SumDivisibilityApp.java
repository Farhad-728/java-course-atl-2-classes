package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SumDivisibilityApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = 1;
        long sum = 1;
        while (sum % k != 0) {
            n++;
            sum += n;
        }
        System.out.println(n);
    }
}
