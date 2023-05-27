package az.atlacademy.leetcode;

import java.util.Arrays;

public class FirstMissingPositiveApp {

    public static void main(String[] args) {
        int[] nums = {2, 4, -1, 1};
        int n = nums.length;
        int posNum = firsMissPosNum(nums, n);
        System.out.println(posNum);
    }

    private static int firsMissPosNum(int[] arr, int n) {
        Arrays.sort(arr);
        int minPosNum = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == minPosNum) {
                minPosNum++;
            }
        }
        return minPosNum;
    }
}

