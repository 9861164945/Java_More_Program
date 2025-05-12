package com.Task30thSept;

import java.util.*;

import sambit.NextMultipleOfHundred;

public class MainNextMulHundred {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int number=sc.nextInt();
		if (number >= 100 && number <= 999) {
            int  nextNum= NextMultipleOfHundred.getNextMultipleOfHundred(number);
            System.out.println("Next Multiple Of Hundred  of the " + number + " is :" +nextNum);
        } else {
            System.out.println("Please enter a valid two-digit number.");
        }
		


	}

}
