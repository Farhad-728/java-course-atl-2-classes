package az.atlacademy.lesson9pr2;

import java.util.Scanner;

public class ProductOfDigitsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            prod *= rem;
        }
        System.out.println(prod);
    }
}
