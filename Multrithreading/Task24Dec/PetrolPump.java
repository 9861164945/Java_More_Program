package com.Multrithreading.Task24Dec;

public class PetrolPump
{
 public synchronized void refillCar(String carName) 
 {
	 try 
	 {
		 System.out.println(carName+" is Started Refilling...");
		 Thread.sleep(3000);
		 System.out.println(carName+" Completed Refilling");
		 
		 
	 }
	 catch(InterruptedException e) 
	 {
		 System.out.println("Refilling interrupted for " + carName);
	 }
	 
 }
	

}
