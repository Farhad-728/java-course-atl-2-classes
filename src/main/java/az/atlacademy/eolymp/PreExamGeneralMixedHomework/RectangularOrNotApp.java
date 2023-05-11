package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class RectangularOrNotApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sqa = (int) Math.pow(a, 2);
        int sqb = (int) Math.pow(b, 2);
        int sqc = (int) Math.pow(c, 2);
        if (sqa == sqc + sqb || sqb == sqc + sqa || sqc == sqb + sqa) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
