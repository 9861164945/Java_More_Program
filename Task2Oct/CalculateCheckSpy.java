package com.Task2Oct;

public class CalculateCheckSpy {
    public static void checkSpyNum(int number) {
        int sum = 0;
        int product = 1;

     
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        
        if (sum == product) {
            System.out.println("The number is a Spy Number.");
        } else {
            System.out.println("The number is not a Spy Number.");
        }
    }
}
