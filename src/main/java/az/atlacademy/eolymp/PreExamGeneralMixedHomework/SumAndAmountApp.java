package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class SumAndAmountApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (scan.hasNext()) {
            int nums = scan.nextInt();
            count++;
            sum += nums;
        }
        scan.close();
        System.out.println(count + " " + sum);
    }
}

