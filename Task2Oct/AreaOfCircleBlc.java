package com.Task2Oct;

public class AreaOfCircleBlc {

public static String getArea(double radius) {
	if(radius<=0) {
		return ""+0;
	}
	else {
		final double pi=3.14;
		double area=pi*radius*radius;
		return ""+area;
	}
}
}
