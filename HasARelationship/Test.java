package com.HasARelationship;
import java.util.*;
public class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Street :");
		String street=sc.nextLine();
		System.out.println("Enter City:");
		String city=sc.nextLine();
		Adress adress=new Adress(street,city);
		adress.setStreet(street);
		adress.setCity(city);
		System.out.println(adress);
		 System.out.println("ENter Person name");
		 String name=sc.nextLine();
		 Person person=new Person(name,adress) ;
		 person.setName(name);
		 person.setAdress(adress);
		 System.out.println(person);
		 sc.close();
		
		
	}

}
