package az.atlacademy.lesson11;

import java.util.Scanner;

public class DollarsInBankApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long s = scan.nextLong();
        long nYear = 0;
        long sum = 0;
        long lastYear = 0;
        while (sum < s) {
            nYear++;
            lastYear = lastYear * 2 + nYear;
            sum += lastYear;
        }
        System.out.println(nYear);
    }
}


