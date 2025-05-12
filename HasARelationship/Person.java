package com.HasARelationship;

public class Person 
{
	private  String name;
	private Adress adress;
	public Person(String name, Adress adress) {
		super();
		this.name = name;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setName(String name)
	{
		if(name.isEmpty()) 
		{
		System.err.println("Name Can not be Empty!");
		System.exit(0);
			
		}
		else 
		{
			this.name = name;	
		}
		
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", adress=" + adress + "]";
	}
	
	
	
}


