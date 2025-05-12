package com.Task30thSept;
import java.util.*;

import sambit.RoundedSum;

public class MainRoundedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("ENter second number");
		int num2=sc.nextInt();
		System.out.println("ENter Third Number");
		int num3=sc.nextInt();
		int sumOfRoundedValues = RoundedSum.sumOfRoundedValues(num1, num2, num3);
		System.out.println("Sum of rounded values"+sumOfRoundedValues);
sc.close();
	}

}
