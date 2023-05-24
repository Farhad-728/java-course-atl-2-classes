package az.atlacademy.module01.exam01;

import java.util.Scanner;

public class BiggerThanItsNeighborsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            int curr = nums[i];
            int prev = nums[i - 1];
            int next = nums[i + 1];
            if (curr > prev && curr > next){
                count++;
                System.out.println(i + ".value " + curr);
            }
        }
        System.out.println(count);
    }
}

