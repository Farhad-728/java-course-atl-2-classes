package az.atlacademy.lesson9;

import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int firstDigit = a / 10;
        int lastDigit = a % 10;
        System.out.print(firstDigit + " " + lastDigit);
    }
}
