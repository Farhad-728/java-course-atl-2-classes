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

        switch (num) {
            case 1:
                System.out.println("Yanvar");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Iyun");
                break;
            case 7:
                System.out.println("Iyul");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;
            case 12:
                System.out.println("Dekabr");
                break;
            default:
                System.out.println("Duzgun daxil edilmeyib");
                break;
        }

    }

}


