package az.atlacademy.lesson6;

import java.util.Locale;
import java.util.Scanner;

public class ScannerApp {
    public static void mainV2(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        System.out.printf("%.5f", num);
    }

    public static void mainV3(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word.length());
        System.out.println(word.toLowerCase(Locale.ROOT));
        System.out.println(word.toUpperCase());
        System.out.println(word.concat("2"));
        System.out.println(word.trim());
        System.out.println(word);
    }

    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println("Yanvar");
        } else if (num == 2) {
            System.out.println("Fevral");
        } else if (num == 3) {
            System.out.println("Mart");
        } else if (num == 4) {
            System.out.println("Aprel");
        } else if (num == 5) {
            System.out.println("May");
        } else if (num == 6) {
            System.out.println("Iyun");
        } else if (num == 7) {
            System.out.println("Iyul");
        } else if (num == 8) {
            System.out.println("Avqust");
        } else if (num == 9) {
            System.out.println("Sentyabr");
        } else if (num == 10) {
            System.out.println("Oktyabr");
        } else if (num == 11) {
            System.out.println("Noyabr");
        } else if (num == 12) {
            System.out.println("Dekabr");
        } else {
            System.out.println("Duzgun daxil edilmeyib");
        }

    }

}


