package com.Task23October;
import java.util.*;
public class Tester 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserId of the Student:");
		int id=sc.nextInt();
		
		System.out.println("Enter the name of The Studnet:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("ENter Exam fees Of the Student");
		double efees=sc.nextDouble();
		
		System.out.println("ENter Type Of the Student:");
		sc.nextLine();
		String type=sc.nextLine();
		if(type.equalsIgnoreCase("Hostel")) 
		{
			System.out.println("Enter Hostel Fees");
			double fees=sc.nextDouble();
			System.out.println("ENter Ammount You pay For Hostel Fees:");
			double amt=sc.nextDouble();
			Hosteler h1=new Hosteler(id,name,efees,fees);
			System.out.println(h1);
			h1.payFee(amt);
			
			
		}
		else if(type.equalsIgnoreCase("DayScholar"))
		{
			
			System.out.println("Enter Transport fees");
			double feees=sc.nextDouble();
			System.out.println("Enter Ammount U Pay for transport fees ");
			double amt=sc.nextDouble();
			
			//DayScholar
			Dayscholar d1=new Dayscholar(id,name,efees,feees);
			
			System.out.println(d1);
			d1.payFee(amt);
			
		}
		else
		{
			System.out.println("ENter ammount exam feee su have to pay:");
			double amt=sc.nextDouble();
			Student s1=new Student(id, name,efees);
			System.out.println(s1);
			s1.payfee(amt);
			
			
		}
		
		
		
		
		
	//Student Object
		
		
		//Hosteler object
		
		
		
	}

}
