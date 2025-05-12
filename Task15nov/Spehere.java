package com.Task15nov;

public class Spehere extends Shape
{

	private final double pi=3.14;

	public Spehere(double size) 
	{
		super(size);
		
	}
	
	
	


	


	public double getArea(double radius) 
	{
		double area=4/3*pi*radius*radius*radius;
		System.out.println("Volume of the Spehere:"+area);
		return area;
		
	}
	
	

}
