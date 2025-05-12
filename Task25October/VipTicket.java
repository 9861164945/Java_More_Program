package com.Task25October;

public class VipTicket extends Ticket 
{
	private String specialAccess;

	public VipTicket(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) 
	{
		if(specialAccess.isEmpty()||specialAccess==null) 
	{
			System.err.println("Special acces Can not  be Empty!");
			System.exit(0);
		
	}
		else 
		{
			this.specialAccess = specialAccess;
				
		}
		
	}
	
	
@Override
public void displayDetails() 
{

	super.displayDetails();
	System.out.println("Special Access:"+specialAccess);
}
	

}
