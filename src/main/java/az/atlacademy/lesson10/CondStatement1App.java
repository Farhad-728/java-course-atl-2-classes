package az.atlacademy.lesson10;

import java.util.Scanner;

public class CondStatement1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x < 5) {
            int y = (x * x) - (3 * x) + 4;
            System.out.println(y);
        } else if (x >= 5) {
            int y = x + 7;
            System.out.println(y);
        }
    }
}
