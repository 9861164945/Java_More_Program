package com.Task23Sept;

public class SimpleInterest {

	public static void main(String[] args) {
		
		double principle=Double.parseDouble(args[0]);
		double rateOfInterest=Double.parseDouble(args[1]);
		double timeInYear=Double.parseDouble(args[2]);
		System.out.println("Principle is:"+principle);
		System.out.println("Rate Of Interest:"+rateOfInterest);
		System.out.println("Time:"+timeInYear);
		double simpleInterest=principle*rateOfInterest*timeInYear/100;
		System.out.println("Simple Interest Is:"+simpleInterest);
		 double total=principle+simpleInterest;
		System.out.println("you have to pay:"+total);
	}

}
