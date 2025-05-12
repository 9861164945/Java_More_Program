package com.Task23October;

public class Student 
{

	int studentId;
	String name;
	double examFee;
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	
	
	
	public double payfee(double amt) 
	{
		double remaininfFees=this.examFee-amt;
		if(remaininfFees<this.examFee){
			System.out.println("U have to pay the Remaining Fees"+remaininfFees);
		}
		else if(remaininfFees==examFee)
		{
			System.out.println("All dues Clear");
		}
		else {
			System.out.println("U pay The Exceed Amt");
		}
		return remaininfFees;
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	
	
}
