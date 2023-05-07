package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SquaresOfNumbersApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int squares = (int) Math.pow(i, 2);
            if (squares > n)
                break;
            System.out.print(squares + " ");
        }
    }
}

