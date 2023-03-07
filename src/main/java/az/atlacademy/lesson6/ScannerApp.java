package az.atlacademy.lesson6;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class ScannerApp {
    public static void mainV2(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        System.out.printf("%.5f", num);
    }

    public static void main(String[] args) {
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
}
