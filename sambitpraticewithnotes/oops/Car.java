package com.sambitpraticewithnotes.oops;

public class Car{
	//Instance variable
 int noOfWheels;
 String color;
 double maxSpeed;
 double currentFuelInLiters;
 int noOfSeats;
 //method

 public void start() {
	 if(this.currentFuelInLiters<=0) {
		 System.out.println("car is out of fuel");
	 }
	 else if(this.currentFuelInLiters<5) {
		 System.out.println("Car is in the reserve mode");
		this.currentFuelInLiters--; 
	 }
	 else {
		 System.out.println("Car  is Started ..");
		 this.currentFuelInLiters--;

	 }
	  }

 
 public void drive() {
	 this.currentFuelInLiters--;
	 
		 System.out.println("Car  is driving");
		 

	 
	  }
 public void addFuel(double fuel) {
	 this.currentFuelInLiters +=fuel;
 }
 public double getCurrentFuelLevel() {
	 return this.currentFuelInLiters;
 }
 
 
 
 //constructor
 
	
}
