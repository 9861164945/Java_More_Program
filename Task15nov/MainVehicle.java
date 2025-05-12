package com.Task15nov;
import java.util.*;
public class MainVehicle 
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENyter Total Diostance");
		double di=sc.nextDouble();
		System.out.println("ENter  total fuel u have:");
		double fuel=sc.nextDouble();
		Car car=new Car(di,fuel);
		car.setTotalDistance(di);
		car.setTotalFuelConsumed(fuel);
		car.calculateFuelEfficiency(di,fuel);
		Vehicle v=new Vehicle(di,fuel);
		v.setTotalDistance(di);
		v.setTotalFuelConsumed(fuel);
		v.calculateFuelEfficiency(di, fuel);
		sc.close();
		}

}
