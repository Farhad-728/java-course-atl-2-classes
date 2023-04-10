package az.atlacademy.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int counter = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}