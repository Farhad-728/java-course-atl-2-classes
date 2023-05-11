package az.atlacademy.lesson15;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println(nums);
    }
}
