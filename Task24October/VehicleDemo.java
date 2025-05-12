package com.Task24October;

import java.util.Scanner;
public class VehicleDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter make:");
		String make=sc.nextLine();
		System.out.println("Enter Model:");
		String model=sc.nextLine();
		System.out.println("Enter year:");
		int year=sc.nextInt();
		 System.out.println("Enter Type of the Vehicle:");
		 sc.nextLine();
		 String vehiType=sc.nextLine();
		 if(vehiType.equalsIgnoreCase ("bike") )
		 {
			 System.out.println("Enter Bike Type");
			 String type=sc.nextLine();
			 Bike b1=new Bike(make, model, year, type);
			 b1.setMake(make);
			 b1.setModel(model);
			 b1.setYear(year);
			 b1.setType(type);
			 b1.displayDetails();
		 }
		
		 else if(vehiType.equalsIgnoreCase ("car")) 
		 {
			 System.out.println("ENter Noof Doors:");
			 int noOfDoor=sc.nextInt();
			 Car c1=new Car(make, model, year, noOfDoor);
			 c1.setMake(make);
			 c1.setModel(model);
			 c1.setYear(year);
			 c1.setNoOfDoor(noOfDoor);
			 c1.displayDetails();
			 
			 
		 }
		
		 else {
			 Vehicle v1=new Vehicle(make,model,year);
			 v1.setMake(make);
			 v1.setModel(model);
			 v1.setYear(year);
			 v1.displayDetails();
		 }
		 
		 sc.close();
		
		//Bike b1=new Bike("ssddf", "ss", 12, "super");
		 //b1.displayDetails();
		 //System.out.println(b1);
		 
	}

}
