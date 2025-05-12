package com.HasARelationship;

public class Car1
{
	private String carName;
	private int carModel;
	private final Engine1 engine; // HAS-A Relation [Blank final field]

	public Car1(String carName, int carModel) 
	{
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.engine =new Engine1("batery",1400); //Composition
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}	


}
