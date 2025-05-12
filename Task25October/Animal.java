package com.Task25October;

public class Animal 
{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name)
	{
		if(name.isEmpty()||name==null) 
		{
			System.err.println("Name can not be Empty");
			System.exit(0);		
		}
		else
		{
			this.name = name;
			
		}
		
	}

	public void  displayDetails() 
	{
	System.out.println("name of the Animal is:"+this.name);	
	}
	



}
