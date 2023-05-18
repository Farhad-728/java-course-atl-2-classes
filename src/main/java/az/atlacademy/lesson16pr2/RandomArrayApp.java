package az.atlacademy.lesson16pr2;

import java.util.Scanner;

public class RandomArrayApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        int max = 0;
        int min = -1;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < size; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < size; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[0]) {
                min = nums[0];
            }
            sum += nums[i];
        }
        System.out.println(max);

        System.out.println(min);

        average = (double) sum / size;
        System.out.println(average);
    }
}
