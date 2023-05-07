package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class MaximumOfAbsoluteValuesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double max = 0;
        for (int i = 0; i < size; i++) {
            double nums = scan.nextDouble();
            if (max < Math.abs(nums)) {
                max = Math.abs(nums);
            }
        }
        System.out.printf("%.2f", max);
    }
}
