package com.Task15nov;

public class Shape 
{
	private double size;

	public Shape(double size) {
		super();
		this.size = size;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size)
	{
		if(size<=0) 
		{
			System.err.println("Size Can not be negative or Zero!");
			System.exit(0);
			
		}
		else 
		{
			this.size = size;

			
		}
			}

	@Override
	public String toString() {
		return "Shape [size=" + size + "]";
	}
	
	
	


}
