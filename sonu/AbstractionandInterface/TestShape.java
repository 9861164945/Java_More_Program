package com.sonu.AbstractionandInterface;

public class TestShape 
{
	public static void main(String[] args) 
	{
		//Shape s1=new Shape();// Object Creation not possible because it  is an abstract class
		
		Circle c1=new Circle(5.9);
		System.out.println("Area of the circlle is "+c1.calculateArea());
		Square s1= new Square(8.2);
		
		System.out.println( "Area of the square is"+s1.calculateArea());
		
		
	}

}
