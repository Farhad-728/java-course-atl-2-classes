package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SquareOfTheSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int firstdDigit = num % 10;
        int secondDigit = (num / 10) % 10;
        int sum = firstdDigit + secondDigit;
        System.out.println(sum * sum);
    }
}
