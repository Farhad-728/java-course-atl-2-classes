package az.atlacademy.lesson9pr2;

import java.util.Scanner;

public class FirstOrLastApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = num / 100;
        int last = num % 10;
        if (first > last) {
            System.out.println(first);
        } else if (first < last) {
            System.out.println(last);
        } else {
            System.out.println("=");
        }
    }
}