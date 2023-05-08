package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class NumberOfDegreesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        System.out.println((long) Math.pow(a, n));
    }
}
