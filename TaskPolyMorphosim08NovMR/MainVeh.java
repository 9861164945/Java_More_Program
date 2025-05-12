package com.TaskPolyMorphosim08NovMR;

public class MainVeh {

	public static void main(String[] args)
	{
		Car car=new Car();
		car.service();
		System.out.println("________________________");
		Vehicle v=new Car();
		v.service();
	}

}
  