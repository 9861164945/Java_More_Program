package com.TaskPolyMorphosim08NovMR;

public class Calculator
{
	public static void main(String[] args) 
	{
		
		Calculator c=new Calculator();
		c.add(12,34);
		c.add(12, 30, 60);
		c.add(34, 67, 80);
		
		
	}
	public void add(int a,int b) 
	{
		int sum=a+b;
		System.out.println("Sum of Two Numbers Are:"+sum);
		
	}
	public void add(int a,int b,int c) 
	{
		int sum=a+b+c;
		System.out.println("Sum of three numbers are:"+sum);
	}
	public void add (double a,double b,double c) {
		double sum=a+b+c;
		System.out.println("Sum ="+sum);
	}

}
