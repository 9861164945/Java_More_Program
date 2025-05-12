package com.Task25sept;

public class CompoundInterest {

	public static void main(String[] args) {
		
	double principlr=Double.parseDouble(args[0]);
	double time=Double.parseDouble(args[1]);
	double rateOfInterest=Double.parseDouble(args[2]);
	System.out.println("Principle is:"+principlr+"");
	System.out.println("Time is:"+time+"years");
	System.out.println("Rate Of Interest is:"+rateOfInterest+"%");
	double compoundInterest=principlr*((1+rateOfInterest/100)*(1+rateOfInterest/100)*(1+rateOfInterest/100))-principlr;
	System.out.println("Compound Interest is:"+compoundInterest);
	
	}

}
