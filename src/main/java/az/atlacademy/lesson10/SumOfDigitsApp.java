package az.atlacademy.lesson10;

import java.util.Scanner;

public class SumOfDigitsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = num / 1000;
        int last = num % 10;
        System.out.println(first + last);
    }
}
