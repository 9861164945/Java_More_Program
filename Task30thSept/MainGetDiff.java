package com.Task30thSept;

import java.util.Scanner;
import sambit.TwoDigitDifference;

public class MainGetDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two-digit number:");
        int number = sc.nextInt();

        // Check if the number is a two-digit number
        if (number >= 10 && number <= 99) {
            int difference = TwoDigitDifference.getDifference(number);
            System.out.println("Difference between the digits of " + number + " is " + difference);
        } else {
            System.out.println("Please enter a valid two-digit number.");
        }
    }
}
