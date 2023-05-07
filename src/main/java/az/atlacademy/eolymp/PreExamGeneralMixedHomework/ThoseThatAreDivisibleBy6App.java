package az.atlacademy.eolymp.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class ThoseThatAreDivisibleBy6App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        int count = 0;
        int nums = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            if (((array[i] % 6) == 0) && (array[i] > 0)) {
                count++;
                nums += array[i];
            }
        }
        System.out.println(count + " " + nums);
    }
}
