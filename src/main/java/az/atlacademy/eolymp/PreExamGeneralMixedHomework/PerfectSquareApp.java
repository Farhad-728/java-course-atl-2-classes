package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class PerfectSquareApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = (int) Math.sqrt(n);
        if (m * m == n) {
            System.out.println(m);
        } else {
            System.out.println("No");
        }
    }
}
