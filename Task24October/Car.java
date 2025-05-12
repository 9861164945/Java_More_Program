package com.Task24October;

public class Car extends Vehicle 
{
	private int noOfDoor;

	public Car(String make, String model, int year, int noOfDoor) {
		super(make, model, year);
		this.noOfDoor = noOfDoor;
	}

//	@Override
//	public String toString() {
//		return "Car [toString()=" + super.toString() + ", noOfDoor=" + noOfDoor + "]";
//	}


	public void displayDetails() 
	{
		System.out.println("Make:"+this.make);
		System.out.println("Model:"+this.model);
		System.out.println("Year"+this.year);
		System.out.println("No Of Door:"+this.noOfDoor);
		
		
	}

	public int getNoOfDoor() {
		return noOfDoor;
	}

	public void setNoOfDoor(int noOfDoor)
	{ if(noOfDoor<=0) 
	{
		System.err.println("This filed NoOf field Can not be zero and negative");
		System.exit(0);
	}
	else 
	{
		this.noOfDoor = noOfDoor;
		
	}
		
	}

	

	
}
