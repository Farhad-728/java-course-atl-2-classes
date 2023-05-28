package az.atlacademy.leetcode;

import java.util.Scanner;

public class HappyNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = num;

        while (result != 1 && result != 4) {
            result = HappyNumber(result);
        }
        if (result == 1) {
            System.out.println("true");
        } else if (result == 4){
            System.out.println("false");
        }
    }
    public static int HappyNumber(int num) {
        int sum = 0, digit = 0;
        while (num > 0) {
            digit = num % 10;
            sum = sum + (digit * digit);
            num /= 10;
        }
        return sum;
    }
}
