package com.Multrithreading.Task24Dec;

public class PetrolPumpSimulation 
{
	public static void main(String[] args) 
	{
		PetrolPump pump=new PetrolPump();
		 Car[] cars=new Car[5];
		 cars[0]=new Car("Hundai", pump);
		 cars[1]=new Car("Thar",pump);
		 cars[2]=new Car("TataNano", pump);
		 cars[3]=new Car("Audi",pump);
		 cars[4]=new Car("Maruti--800--", pump);
		 
		 Thread[] threads=new Thread[5];
		
		 for(int i=0;i<cars.length;i++) 
		 {
			 threads[i]=new Thread(cars[i]);
			 threads[i].start();
			 
		 }
		 try {
	            for (int i = 0; i < threads.length; i++) {
	                threads[i].join(); 
	                }
	        } catch (InterruptedException e) {
	            System.out.println("----Main thread interrupted--");
	        }
		 System.out.println("All cars have completed refilling--Visit Again----");
	}

}
