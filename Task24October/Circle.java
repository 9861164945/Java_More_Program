package com.Task24October;

public class Circle 
{

	double radius;
	final double pi=3.14;
	public Circle() {
		this.radius=1.2;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius)
	{
		
		if(radius<=0) 
	{
		System.err.println("Invalid Input Radius   must be a Positive!");
		System.exit(0);
		
	}
	else 
	{
		this.radius = radius;
			
	}
	}
	public double getArea(double radius) 
	{
		 
		 double area=pi*radius*radius;
		 return area;
		
		
	}

	@Override
	public String toString() 
	{
		return "Radius of Circle=" + radius;
	}
	
	
	
	
}

