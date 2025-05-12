package com.sonu.AbstractionandInterface2;

public class Eagle extends  Bird
{
	public  Eagle(String breed)
	{
		super(breed);
	}

	@Override
	public void flyAble()
	{
		System.out.println(getBreed()+ " Can Fly!");
	
		
	}

	
}
