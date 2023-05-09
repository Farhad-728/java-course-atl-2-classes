package az.atlacademy.lesson14pr1;

import java.util.Optional;
import java.util.Scanner;

public class SearchingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("------");
        System.out.println(findNumArray(array, size));
    }

    public static Optional<Integer> findNumArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}