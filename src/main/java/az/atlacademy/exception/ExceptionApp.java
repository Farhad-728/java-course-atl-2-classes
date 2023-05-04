package az.atlacademy.exception;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int num1 = 0;
        int num2 = 0;
        try {
            num1 = Integer.parseInt(word1);
            num2 = Integer.parseInt(word2);
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
        System.out.print(num1 / num2);
    }

}

