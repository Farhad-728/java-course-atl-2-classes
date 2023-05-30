package az.atlacademy.leetcode;

import java.util.Arrays;
public class FirstMissingPositiveApp {

    public static void main(String[] args) {
        int[] nums = {-4, 2, 5, 1, 3, 4, 6};
        int posNum = firsMissPosNum(nums);
        System.out.println(posNum);
    }

    private static int firsMissPosNum(int[] arr) {
        Arrays.sort(arr);  // -4, 0, 1, 2, 3, 5, 6, 7, 8, 11, 14
        int minPosNum = 1;
        for (int j : arr) {
            if (j == minPosNum) {
                minPosNum++;
            } else if (j > 0) {
                return minPosNum;
            }
        }
        return (++arr[arr.length - 1]);
    }
}

