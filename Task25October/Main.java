package com.Task25October;
import java.util.*;
public class Main 
{ 
	public static void main(String[] args)
{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Name Of the Animal:");
		String name=sc.nextLine();
		
		System.out.println("ENter Hastype");
		boolean hasType=sc.nextBoolean();
		
		System.out.println("ENter type of the Animal");
		sc.nextLine();
		String type=sc.nextLine();
		if(type.equalsIgnoreCase("dog")) 
		{
			System.out.println("Enter breed");
			String breed=sc.nextLine();
			 Dog dog=new Dog(name,hasType,breed);
			dog.setName(name);;
			dog.setHasFur(hasType);
			dog.setBreed(breed);
			dog.displayDetails();
			
		}
		else if(type.equalsIgnoreCase("Mamal"))
		{
			Mammal mammal=new Mammal(name, hasType);
			mammal.setName(name);
			mammal.setHasFur(hasType);
			mammal.displayDetails();
		}
		else
		{
			System.out.println("This is the Objecg of the Suoper Class Animal");
		

			Animal animal=new Animal(name);
			animal.setName(name);
			animal.displayDetails();
			
		}
	
}

}
