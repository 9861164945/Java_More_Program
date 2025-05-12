package com.Task15nov;

public class Cube  extends Shape
{


	public Cube(double size) {
		super(size);
	}
	
	public  double getArea( double size)
	
	{
	
		double area =size*size*size;
		System.out.println("Volume oof the Cubee is "+area);
		return area;
		
	}

	@Override
	public String toString() {
		return "Cube [toString()=" + super.toString() + "]";
	}

	
	

}
