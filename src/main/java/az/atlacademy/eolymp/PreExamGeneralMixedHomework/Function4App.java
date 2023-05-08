package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class Function4App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long fX = 1 + x + (x * x);
        System.out.println(fX);
    }
}
