package az.atlacademy.lesson12;

import java.util.Scanner;

public class PrintArrayApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
