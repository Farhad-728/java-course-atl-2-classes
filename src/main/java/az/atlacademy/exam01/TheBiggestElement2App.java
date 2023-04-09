package az.atlacademy.exam01;

import java.util.Scanner;

public class TheBiggestElement2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int indexOfMax = 0;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            if (max < curr) {
                max = curr;
                indexOfMax = i;
            }
        }
        System.out.println(max + " " + indexOfMax);

    }
}
