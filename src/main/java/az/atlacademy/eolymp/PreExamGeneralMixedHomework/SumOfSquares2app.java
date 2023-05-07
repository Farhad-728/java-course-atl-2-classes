package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SumOfSquares2app {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += (i * i);
        }
        System.out.println(sum);
    }
}

