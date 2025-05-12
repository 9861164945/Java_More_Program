package com.Task25October;

public class Dog  extends Mammal
{
	private String  breed;

	public Dog(String name, boolean hasFur, String breed)
	{
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() 
	{
		return breed;
	}

	public void setBreed(String breed) 
	{
		if(breed.isEmpty()||breed==null) 
	{
			System.out.println("Breed name Can not Be Empty!");
			System.exit(0);
			
		
	}
		else 
		{

			this.breed = breed;

			
		}	
	}

	@Override
	public void displayDetails()
	{
		
		System.out.println("Animal : "+getName()+"Fur : "+getHasFur()+"Breed is"+this.breed);
		
	}
	
}
