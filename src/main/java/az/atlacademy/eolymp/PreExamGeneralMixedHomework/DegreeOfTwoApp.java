package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class DegreeOfTwoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long degre = 1;
        while (degre < n) {
            degre *= 2;
        }
        if (degre == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

