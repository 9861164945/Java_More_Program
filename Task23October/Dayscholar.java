package com.Task23October;

public class Dayscholar extends Student
{
	double transportFee;

	public Dayscholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee =transportFee;
	}
	
	public void payFee(double amt) 
	{
		double feeUhavetoPay=this.transportFee-amt;
		if(feeUhavetoPay<this.transportFee) {
			System.out.println("You have to pay the Remaining Fees"+feeUhavetoPay);
		}
		else if(feeUhavetoPay==this.transportFee)
		{
			System.out.println("all dues Clear");
			
		}
		else
		{
			System.out.println("U pay The Exceed Ammount Please collect the Cash!");
			
		}
		
	}

	@Override
	public String toString() {
		return "Dayscholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", transportFee="
				+ transportFee + "]";
	}
	
	

}
