package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class NegativeElementsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] nums = new double[size];
        double negative = 0;
        double sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextDouble();
            if (negative > nums[i]) {
                sum += nums[i];
                count++;
            }
        }
        System.out.printf(count + " " + "%.2f", sum);
    }
}
