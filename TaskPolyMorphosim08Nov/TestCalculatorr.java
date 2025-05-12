package com.TaskPolyMorphosim08Nov;
import java.util.*;
public class TestCalculatorr 
{
	public static void main(String[] args) 
	{
		/*Calculator c=new Calculator();
		c.add(10.6, 19.8);
		c.add(10,20);
		c.mult(10.8, 20.8);
		c.mult(3, 2);
	*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:"); 
		int num2=sc.nextInt();
		Calculator c=new Calculator();
		c.add((double)num1,(double)num2);
		c.add(num1, num2);
		c.mult((double)num1, (double)num2);
		c.mult(num1, num2);
		sc.close();
		
	}

}
