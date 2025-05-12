package com.Inheritance.Iq;

public class Square extends Shape
{
	public Square(int side)  //10  
	{
		super(side);
	}
	
	public void getAreaOfSquare()
	{
		double area = super.x * super.x;
		System.out.println("Area of Square is :"+area);
	}

}
