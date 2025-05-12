package com.Task20thSeptember;

public class SumAverageOfThreeNumber {
	public static void main(String args[]) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int sum=num1+num2+num3;
		float avg=(num1+num2+num3)/3;
		System.out.println("Sum of three number="+sum);
		System.out.println("Average of three Number="+avg);
	}

}
