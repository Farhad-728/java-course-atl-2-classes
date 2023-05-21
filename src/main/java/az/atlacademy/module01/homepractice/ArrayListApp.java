package az.atlacademy.module01.homepractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        nums.add(10.0);
        nums.add(3.0);
        nums.add(4.0);
        nums.add(5.0);
        nums.add(8.0);
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);

        System.out.println(nums.size());

        System.out.println(nums.contains(3.0));

        nums.sort((num1, num2) -> Double.compare(num2, num1));
        System.out.println(nums);

        nums.clear();
        System.out.println(nums);

    }
}
