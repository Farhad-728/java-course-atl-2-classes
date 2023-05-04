package az.atlacademy.lesson02.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class RectangularOrNotApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        if (side1 != side2 || side1 != side3 || side2 != side3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
