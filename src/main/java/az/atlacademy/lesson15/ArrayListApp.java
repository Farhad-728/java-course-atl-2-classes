package az.atlacademy.lesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
            nums.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer integer, Integer t1) {
                    return 0;
                }
            });
        }
        System.out.println(nums);
    }
}
