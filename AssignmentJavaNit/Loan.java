package com.AssignmentJavaNit;

public class Loan 
{
	private double principle;
	private double interestRate;
	private int durationMonths;

	public Loan(double principle, double interestRate, int durationMonths)
	{
		if(this.principle<=0  ||this.interestRate <=0||this.durationMonths<=0) 
		{
			System.err.println("Error");
			return;
		}
		else {
		
			this.principle = principle;
			this.interestRate = interestRate;
			this.durationMonths = durationMonths;
		}
		
	}
	
	//Getter
	public double getPrinciple()
	{
		return this.principle;
	}
	public double getInterestRate()
	
	{
		return this.interestRate;
	}
	public int getdurationMonths() 
	{
		return this.durationMonths;
	}
	//setter
	
	
	public double calculateMonthlyPayment() 
	{
		
		double amt=0;
		double interest=(principle*interestRate*durationMonths)/100;
		amt=(amt+principle+interest)/durationMonths;
		
		return amt;
		
	}



	@Override
	public String toString() 
	{
		


		return "Loan [principle=" + principle + ", interestRate=" + interestRate + ", durationMonths=" + durationMonths
				+"Monthly Payment:"+calculateMonthlyPayment()+ "]";
	
		
	
	}
	
	
	
	
	
	
	
	
	

}
