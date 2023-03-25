package az.atlacademy.lesson10;

import java.util.Scanner;

public class EachConditionOfTwoapp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 3 == 0 && ((n % 2 == 0 && n > 9 && n < 100) || (n < -9 && n > -100))) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}

