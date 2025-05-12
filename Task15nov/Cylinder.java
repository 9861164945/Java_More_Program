package com.Task15nov;

public class Cylinder  extends Shape
{
	private double  height;
	//private double radius// not needed 
	final double pi=3.14;
	public Cylinder(double size, double height) {
		super(size);
		this.height = height;
	
}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height)
	{
		if(height<=0) 
		{
			System.err.println("Height Can not be negative or zero");
			System.exit(0);

			
		}
		else 
		{
			this.height = height;
			
		}
		
		
	}




	



	public double  getArea(double radius,double height)
	{
		
		double area=pi*radius*radius*height;
		
		System.out.println("Volume of the Cylinder is "+area);
		

		return  area;

				
	}
	
}
