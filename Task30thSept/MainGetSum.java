package com.Task30thSept;
import java.util.*;

import sambit.TwoDigitSum;

public class MainGetSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  two digit Number:");
		int num=sc.nextInt();
		if (num >= 10 && num <= 99) {
            int difference = TwoDigitSum.getSumOfDigits(num);
            System.out.println("Sum between the digits of " + num + " is " + difference);
        } else {
            System.out.println("Please enter a valid two-digit number.");
        }
	}}
