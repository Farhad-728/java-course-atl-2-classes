package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class TransformationApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 2 != 0) {
                n++;
            }
            count++;
        }
        System.out.println(count);
    }
}
