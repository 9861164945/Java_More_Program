package com.Task21thSeptember;

public class CalculateTemprature {

	public static void main(String[] args) {
		double fahrenheit=Double.parseDouble(args[0]);
		double celcius=(fahrenheit-32)*5/9;
		System.out.println("After converting Fahrenheit to celcius is"+celcius);

	}

}
