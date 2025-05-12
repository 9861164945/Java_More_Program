package com.Task23October;

public class Hosteler  extends Student
{
	double hostelFees;

	public Hosteler(int studentId, String name, double examFee, double hostelFees) {
		super(studentId, name, examFee);
		this.hostelFees = hostelFees;
	}
	public double  payFee(double amt) 
	{
		double feesUhavetoPay=this.hostelFees-amt;
	if(feesUhavetoPay<this.hostelFees)
	{
System.out.println("You have to Pay The Feees"+feesUhavetoPay);
		
	}
	else if(feesUhavetoPay==this.hostelFees)
	{
		System.out.println("All dues Are Clear");
	}
	else
	{
		System.out.println("Exceed Ammount U pay: Pls Collect the Money:");
	}
		
	return feesUhavetoPay;
	}

	@Override
	public String toString() {
		return "Hosteler [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", hostelFees="
				+hostelFees+ "]";
	}

	
	

}
