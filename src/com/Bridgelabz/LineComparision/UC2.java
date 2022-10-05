package com.Bridgelabz.LineComparision;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UC2 {
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
        System.out.println("Enter point a1 : ");
        int a1 = sc.nextInt();
        System.out.println("Enter point a2 : ");
        int a2 = sc.nextInt();
        System.out.println("Enter point b1 : ");
        int b1 = sc.nextInt();
        System.out.println("Enter point b2 : ");
        int b2 = sc.nextInt();

        equalsTo(x1, x2, y1, y2, a1, a2, b1, b2);
    }
    public static void equalsTo(int x1, int x2, int y1, int y2, int a1, int a2, int b1, int b2){
        int length1 = (int) sqrt((x2 - x1)^2 +(y2-y1)^2);
        int length2 = (int) sqrt((a2 - a1)^2 +(b2-b1)^2);

        System.out.println("Length of line1 = " + length1);
        System.out.println("Length of line2 = " + length2);

        if(length1==length2){
            System.out.println("Line1 and Line2 are equal");
        }else {
            System.out.println("Line1 and Line2 are not equal");
        }

    }

}
