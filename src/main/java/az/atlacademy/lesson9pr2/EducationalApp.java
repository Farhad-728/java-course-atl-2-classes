package az.atlacademy.lesson9pr2;

import java.util.Scanner;

public class EducationalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 && num <= 3) {
            System.out.println("Initial");
        } else if (num >= 4 && num <= 6) {
            System.out.println("Average");
        } else if (num >= 7 && num <= 9) {
            System.out.println("Sufficient");
        } else if (num >= 10 && num <= 12) {
            System.out.println("High");
        }
    }
}
