package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Arrays;
import java.util.Scanner;

public class MedianNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = scan.nextInt();
        }
        Arrays.sort(number);
        System.out.println(number[1]);
    }
}

