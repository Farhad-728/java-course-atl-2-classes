package az.atlacademy.lesson9;

import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        System.out.println(2*(a + b));
    }
}