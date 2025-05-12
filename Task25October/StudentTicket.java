package com.Task25October;

public class StudentTicket extends Ticket 
{
	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() 
	{
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) 
	{
		if(studentDiscount==true||studentDiscount==false)
		{
			this.studentDiscount = studentDiscount;
				
		}
		else {
			System.err.println("Boolean Value only Takes Either True Or False As Input!");
			System.exit(0);
		}
		}
	
	@Override
	public void displayDetails() 
	{
		super.displayDetails();
		System.out.println("Student Discount "+studentDiscount);
		
	}
	
	

}
