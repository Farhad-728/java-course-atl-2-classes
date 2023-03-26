package az.atlacademy.lesson11;

import java.util.Scanner;

public class UseTheFunctionApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();
        }
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            double cur = arr[i];
            if (max < cur) {
                max = cur;
            }
        }
        System.out.println(max);
    }
}
