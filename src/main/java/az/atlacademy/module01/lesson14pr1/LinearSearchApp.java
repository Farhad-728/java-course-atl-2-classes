package az.atlacademy.module01.lesson14pr1;

import java.util.Optional;
import java.util.Scanner;

public class LinearSearchApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101);
            System.out.print(nums[i] + " ");
        }
        int n = scan.nextInt();
        System.out.println(findNumArray(nums, n));
    }

    public static Optional<Integer> findNumArray(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
