package com.Inheritance;

public class Son1 extends Father1 
{
	protected double balance=18000;//Variable Hiding

	public void showBalance() 
	{
		System.out.println("Son balance is:"+this.balance);

//		System.out.println("Father Balance is"+this.balance);//Because of data hiding it access only the Properties of the Sin1 class so the Op comes 18000
		
		System.out.println("Father Balance is:"+super.balance);//50000
	}
}
