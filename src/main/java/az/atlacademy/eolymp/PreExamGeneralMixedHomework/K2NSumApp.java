package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class K2NSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int sum = (int) (Math.pow(2, k) + Math.pow(2, n));
        System.out.println(sum);
    }
}
