package com.Task25October;

public class Ticket 
{
	private String eventName;
	private int seatNumber;
	private double price;
	 public Ticket(String eventName,int seatNumber,double price) 
	 {
		 super();
		 this.eventName=eventName;
		 this.seatNumber=seatNumber;
		 this.price=price;
	 }
	 
	 
	 public String getEventName(String eventName)
	 {
		 return this.eventName; 
		 
	 }
	 public int getSeatNumber(int seatNumber) 
	 {
		 return this.seatNumber;
		 
	 }
	 public double getPrice(double price) 
	 {
		 return this.price;
		 
	 }
	 
	 public void setEventName(String eventName)
	 {
		 if(eventName.isEmpty()||eventName==null) 
		 {
			 System.err.println("Event Name Can not be empty!");
			 System.exit(0);
			 
		 }
		 else
		 {
			 this.eventName = eventName;
			 
		 }
		
	}


	public void setSeatNumber(int seatNumber) 
	{
	if(seatNumber<=0)
	{
		System.err.println("SeatNumber Can not be negative or Zero!");
		System.exit(0);	
	}
	else
	{
		this.seatNumber = seatNumber;
	}
		
	}


	public void setPrice(double price) 
	{
		if(price<=0) 
		{
			System.err.println("Price must be Positive Number!");
			System.exit(0);
			
			
		}
		else
		{

			this.price = price;
		}
		}
			
		


	public void displayDetails() 
	 {
		 System.out.println("Event Name is:"+eventName);
		 System.out.println("Seat Number is:"+seatNumber);
		 System.out.println("Price Is :$"+price);
		 
		 
	 }
	


}
