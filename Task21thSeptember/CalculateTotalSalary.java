package com.Task21thSeptember;

public class CalculateTotalSalary {

	public static void main(String[] args) {
		double basic_salary=Double.parseDouble(args[0]);
		double hra =(basic_salary*15)/100;
		double conveyance_allowance=(basic_salary*15)/100;
		double entertainment_allowance=(basic_salary*10)/100;
		double total_salary=basic_salary+hra+conveyance_allowance+entertainment_allowance;
		System.out.println("Total Salary is "+total_salary);
		
		
		

	}

}
