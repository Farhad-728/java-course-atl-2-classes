package az.atlacademy.PreExamGeneralMixedHomework;

import java.util.Scanner;

public class WhatTypeOfTriangleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println(1);
        } else if (side1 == side2 && side2 != side3 && side1 != side3) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
