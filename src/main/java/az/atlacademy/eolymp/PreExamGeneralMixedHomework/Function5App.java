package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class Function5App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = scan.nextLong();
        long z = scan.nextLong();
        long fXyZ = x * y * z + x + y * y + z * z * z;
        System.out.println(fXyZ);
    }
}
