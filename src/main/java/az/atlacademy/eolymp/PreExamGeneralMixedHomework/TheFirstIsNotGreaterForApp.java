package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class TheFirstIsNotGreaterForApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextDouble();
        }
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] <= 2.5) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.printf((index + 1) + " " + "%.2f", array[index]);
        }
    }
}

