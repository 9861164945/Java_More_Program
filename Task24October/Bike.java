package com.Task24October;

public class Bike extends Vehicle
{
	String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		if(type.isEmpty()||type==null) 
		{
			System.out.println("This Field type can not be Empty");
			System.exit(0);
		}
		else 
		{
			this.type = type;
			
		}
		
	}


	
	//	@Override
//	public String toString() {
//		return "Bike [type=" + type + ", toString()=" + super.toString() + "]";
//	}

	public void displayDetails() 
	{
		System.out.println("Make:"+this.make);
		System.out.println("Model:"+this.model);
		System.out.println("Year:"+this.year);
		System.out.println("Type:"+this.type);
		
		
	}


}
