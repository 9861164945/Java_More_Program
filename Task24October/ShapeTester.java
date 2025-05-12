package com.Task24October;
import java.util.*;
public class ShapeTester
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of the Circle:");
		double radius=sc.nextDouble();
		System.out.println("Enter type Which Shape U  want to Find  Area :");
		sc.nextLine();
		String type=sc.nextLine();
		if(type.equalsIgnoreCase("circle")) 
		{
			Circle c1=new Circle();
			c1.setRadius(radius);
			
			System.out.println(c1);
			System.out.println(c1.getArea(radius));	
		}
		else if(type.equalsIgnoreCase("cylinder"))
		{
			System.out.println("Enter height:");
			double height=sc.nextDouble();
			Cylinder cy1=new Cylinder();
			cy1.setRadius(radius);
			cy1.setHeight(height);
			System.out.println(cy1);
			System.out.println(cy1.getVolume(height, radius));
			
		}
		else
		{
			System.err.println("U have to choose The value Between Circle and Cylinder");
		}
 		
		sc.close();
		
		
		
	}

}
