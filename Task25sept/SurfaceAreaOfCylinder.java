package com.Task25sept;

public class SurfaceAreaOfCylinder {

	public static void main(String[] args) {
		double radius=Double.parseDouble(args[0]);
		double height=Double.parseDouble(args[1]);
		double pi=3.14;
		double areaOfCylinder=2*pi*radius*radius*2*pi*radius*height;
		System.out.println("Area of the Cylinder"+areaOfCylinder);
		
		
	}

}
