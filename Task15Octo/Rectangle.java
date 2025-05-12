package com.Task15Octo;
import java.util.*;
public class Rectangle
{

	private double width;
	private double height;
	
	{
		width=0;
		height=0;
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public static Rectangle getRectangleObject() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Width Of the Rectangle:");
		double wid=sc.nextDouble();
		if(wid<=0 ) 
		{
			System.err.println(" !oops Width and Height Must be Positive");
			System.exit(0);
		}
		
		System.out.println("Enter Height of the Rectangle:");
		double heig=sc.nextDouble();
		if(heig<=0) 
		{
			System.err.println(" !oops Width and Height Must be Positive");
			System.exit(0);
		}
		
		
		return new Rectangle(wid,heig);
		
		
	}
	
	
	public double getArea() 
	{
		return width*height;
	}
	public double getPerimeter()
	{
		return 2*(width+height);
		
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", Area=" + getArea() + ", Perimeter="
				+ getPerimeter() + "]";
	}
	
	
}
