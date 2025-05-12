package com.Multrithreading.Task24Dec;

public class Car  implements Runnable

{
	private String carName;
	PetrolPump petrolPump;
	
	

	public Car(String carName, PetrolPump petrolPump) {
		super();
		this.carName = carName;
		this.petrolPump = petrolPump;
	}



	@Override
	public void run() {
		
		petrolPump.refillCar(carName);
		
	}

}
