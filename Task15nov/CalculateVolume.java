package com.Task15nov;
import java.util.*;
public class CalculateVolume
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  Shape");
	double shape=sc.nextDouble();
	System.out.println("Enter the height of the cylinder");
	double  height=sc.nextDouble();
	//Cylinder
	Cylinder  c1= new Cylinder( shape, height);
	c1.setSize(shape);
	c1.setHeight(height);
	c1.getArea(shape, height);
	
	//Cube
	Cube c2=new Cube(shape);
	c2.setSize(shape);
	
	c2.getArea(shape);
	///spehere
	
	Spehere  s1=new Spehere(shape);
	s1.setSize(shape);
	s1.getArea(shape);
	
	
	sc.close();
	
	
}
	

}
