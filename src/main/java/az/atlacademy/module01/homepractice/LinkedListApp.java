package az.atlacademy.module01.homepractice;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListApp<E> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            nums.add((int) (Math.random() * 101));
        }
        System.out.print(nums + " ");

        nums.getFirst();

    }
}
