package com.Task15nov;

public class Car  extends Vehicle

{

	public Car(double totalDistance, double totalFuelConsumed) {
		super(totalDistance, totalFuelConsumed);
	}
	
	public double calculateFuelEfficiency(double totalDistance,double totalFuelConsumed) {

		double total=totalDistance/totalFuelConsumed;
		System.out.println(" Car Fuel Effieiency "+total);
		return total;
		
	}

	@Override
	public String toString() {
		return "Car [toString()=" + super.toString() + "]";
	}
	
	
}
