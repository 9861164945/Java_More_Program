package com.Task24October;

public class Vehicle 
{
	 String make;
	 String model;
	 int year;
	
	public Vehicle(String make,String model,int year) 
	{
		super();
		this.make=make;
		this.model=model;
		this.year=year;
	}

	
	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public int getYear() {
		return year;
	}


	public void setMake(String make) 
	{
		if(make.isEmpty()||make==null) {
			System.err.println("This Field Make Can not be Empty:");
			System.exit(0);
		}
		else
		{
			this.make = make;
		}
		
	}


	public void setModel(String model) 
	{
		if(model.isEmpty()||model==null)
			
		{
			System.err.println("This Field Model Can not Be empty:");
			System.exit(0);
		}
		else 
		{
			this.model = model;
			
		}
		
		
	}


	public void setYear(int year)
	{
		if(year<=0) {
			System.err.println("this filed Year Can Not be Zero or negative:");
			System.exit(0);
			
		}
		else
		{
			this.year = year;
			
		}
		
	}


	//@Override
//	public String toString() {
//		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + "]";
//	}
//	
	public void displayDetails() 
	{
		System.out.println("Make:"+this.make);
		System.out.println("Model:"+this.model);
		System.out.println("Year"+this.year);
		
		
	}

}
