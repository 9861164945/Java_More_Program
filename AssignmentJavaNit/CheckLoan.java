package com.AssignmentJavaNit;
import java.util.*;
public class CheckLoan {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle");
		double principle=sc.nextDouble();
		System.out.println("Enter Rate of interest ");
		double rateOfInterest=sc.nextDouble();
		System.out.println("Enter Time In Months ");
		int time=sc.nextInt();
		Loan loan=new Loan(principle,rateOfInterest,time);
		if(principle>0 && rateOfInterest>0 && time>0) 
		{
			loan.getPrinciple();
			loan.getdurationMonths();
			loan.getInterestRate();
			loan.calculateMonthlyPayment();
			System.out.println(loan);
		
		}
		else {
			System.err.println("Error Dont Allow!");
		}
		}

}
