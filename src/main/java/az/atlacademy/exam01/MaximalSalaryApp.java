package az.atlacademy.exam01;

import java.util.Scanner;

public class MaximalSalaryApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maxSalary = -1;
        double salary;
        while (scan.hasNext()) {
            salary = scan.nextDouble();
            if (maxSalary < salary)
                maxSalary = salary;
//            maxSalary = Math.max(maxSalary, salary);
        }
        System.out.println(maxSalary);
    }
}

