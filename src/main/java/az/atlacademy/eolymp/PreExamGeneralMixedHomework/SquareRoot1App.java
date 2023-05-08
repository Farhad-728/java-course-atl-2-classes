package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SquareRoot1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        double square = Math.sqrt(n);
        System.out.printf("%.6f", square);
    }
}
