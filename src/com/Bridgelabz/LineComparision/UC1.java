package com.Bridgelabz.LineComparision;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter point x1 : ");
        int x1 = sc.nextInt();
        System.out.println("Enter point x2 : ");
        int x2 = sc.nextInt();
        System.out.println("Enter point y1 : ");
        int y1 = sc.nextInt();
        System.out.println("Enter point y2 : ");
        int y2 = sc.nextInt();

        calculateLength(x1, x2, y1, y2);

    }
    public static void calculateLength(int x1, int x2, int y1, int y2) {

        int length = (int) sqrt((x2 - x1)^2 +(y2-y1)^2);
        System.out.println("length of a line is " + length);

    }

}
