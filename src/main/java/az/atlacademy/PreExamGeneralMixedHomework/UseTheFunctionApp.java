package az.atlacademy.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class UseTheFunctionApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        // min(max(x, y), max(y, z), x + y + z);
        double sum = x + y + z;
        double maxYz = Math.max(y, z);
        double maxXy = Math.max(x, y);
        double min = Math.min(maxXy, maxYz);
        double lastMin = Math.min(min, sum);
        System.out.println(lastMin);
    }
}