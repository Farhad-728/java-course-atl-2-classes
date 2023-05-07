package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class MaxMinListArrayApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = in.nextInt();
            System.out.println(nums[i]);
        }
    }
}
