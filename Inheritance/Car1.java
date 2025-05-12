package com.Inheritance;

public class Car1  extends Vehicle
{
protected String typeOfEngine = "Battery";
	
	public void getEngineDetails()
	{
		System.out.println("Vehicle Engine type :"+this.engineType);
		System.out.println("Car Engine type :"+this.typeOfEngine);
		
		/*
		 *  Here Vehicle class property (engineType) is by default available to Car class due to Inheritance so we can access using this keyword*/
	}}
