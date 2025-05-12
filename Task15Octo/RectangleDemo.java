package com.Task15Octo;

import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many objects?: ");
        int noOfObjects = sc.nextInt();
        
        for (int i = 1; i <= noOfObjects; i++) {
            Rectangle rectangle = Rectangle.getRectangleObject();
            System.out.println(rectangle);
        }
        
        sc.close();
    }
}
