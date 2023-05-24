package az.atlacademy.module01.lesson17;

import java.util.Scanner;

public class RandomArrayApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];

        int sum = 0;
        double average = 0;
        for (int i = 0; i < size; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int max = 0;
        int min = nums[0];
        for (int i = 0; i < size; i++) {

            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
            sum += nums[i];
        }
        System.out.println(max);
        System.out.println(min);

        average = (double) sum / size;
        System.out.println(average);
    }
}
