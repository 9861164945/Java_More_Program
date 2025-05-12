package com.HasARelationship;

public class Car 
{
	private String make;
	private String  carModel;
	private  final Engine engine;
	public Car(String make, String carModel) {
		super();
		this.make = make;
		this.carModel = carModel;
		this.engine = new Engine("V6");
	}
	public String getMake() 
	{
		return make;
	}
	public String getCarModel() 
	{
		return carModel;
	}
	
	public void setMake(String make) 
	{
		if(make.isEmpty()||make==null) 
		{
			System.err.println("Empty String Can Not use!");
			System.exit(0);
			
		}
		else 
		{
			
			this.make = make;
		}
		
	}
	public void setCarModel(String carModel)
	{
		if(carModel.isEmpty()||carModel==null) 
		{
			System.err.println("Model Can not be empty");
			System.exit(0);
			
		}
		else 
		{
			this.carModel = carModel;
		}
		
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", carModel=" + carModel + " ,Engine"+engine+"]";
	}
	
	

}
