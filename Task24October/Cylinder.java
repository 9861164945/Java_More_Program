package com.Task24October;

public class Cylinder  extends Circle
{
	double height;

	public Cylinder() 
	{
		this.height=1.3;
		
	}
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) 
	{
		if(height<=0)
	{
			System.err.println("Invalid Input Height must not be Zero or Negative!");
		System.exit(0);
	}
		else
		{
			this.height = height;
		}
		
	}
	
	public double getVolume(double height,double radius) 
	{
		double area=2*pi*radius*height+2*pi*radius*radius;
		return area;
		
	}
	@Override
	public String toString() 
	{
		
		return "Cylinder height=" + height +", Cylinder radius="+super.radius;
	}
	
	
}
