package com.Task15nov;

public class Vehicle 
{
	 private double totalDistance;
	 private double totalFuelConsumed;
	
	 public Vehicle(double totalDistance, double totalFuelConsumed) 
	 {
		super();
		this.totalDistance = totalDistance;
		this.totalFuelConsumed = totalFuelConsumed;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public double getTotalFuelConsumed() {
		return totalFuelConsumed;
	}

	public void setTotalDistance(double totalDistance)
	{
		if(totalDistance<=0) 
		{
			System.err.println("Ditance Can Not be negative U hsve to input Some Value:");
			System.exit(0);
		}
		else 
		{
			this.totalDistance = totalDistance;
			
		}

		
	}

	public void setTotalFuelConsumed(double totalFuelConsumed) 
	{
		if(totalFuelConsumed<=0) {
			System.err.println("Fuel Can noit be negative or zero!");
			System.exit(0);
			}
		this.totalFuelConsumed = totalFuelConsumed;
	}
	 
	
public double calculateFuelEfficiency(double totalDistance,double totalFuelConsumed) {

	double total=totalDistance/totalFuelConsumed;
	System.out.println("Fuel Effieiency "+total);
	return total;
	
	
}

@Override
public String toString() {
	return "Vehicle [totalDistance=" + totalDistance + ", totalFuelConsumed=" + totalFuelConsumed + "]";
}



	 
}
