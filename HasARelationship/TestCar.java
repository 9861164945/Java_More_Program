package com.HasARelationship;
import java.util.*;
public class TestCar
{
public static void main(String[] args) 
{
	
	Scanner sc=new Scanner(System.in);
	

	System.out.println("Enter CarMake:");
	String make=sc.nextLine();
	System.out.println("Enter carModel:");
	
	String  carmodel=sc.nextLine();
	Car car=new Car(make,carmodel);
	car.setMake(make);
	car.setCarModel(carmodel);
	
	System.out.println(car);
	sc.close();
	
}


}
