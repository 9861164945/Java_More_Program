package com.Task20thSeptember;

public class CalculateTax {
	public static void main(String[] args) {
		int taxableIncome=Integer.parseInt(args[0]);
		double rateOfTax=Double.parseDouble(args[1]);
		if(rateOfTax==4.9) {
		double tax=(taxableIncome*rateOfTax)/100;
		System.out.println("For a Taxable income of Rs."+taxableIncome+"the rate of Interest is"+rateOfTax+"The Tax is"+tax);
		
	}
		else {
		System.out.println("Tax Not Calculated");
		}

}
}