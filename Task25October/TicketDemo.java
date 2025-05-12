package com.Task25October;
import java.util.*;
public class TicketDemo
{
	public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Event:");
	String event=sc.nextLine();
	
	System.out.println("ENter SeatNumber:");
	int no=sc.nextInt();
	
	System.out.println("Enter price:");
	double price=sc.nextDouble(); 
	
	System.out.println("ENter type:");
	sc.nextLine();
	String type=sc.nextLine();
	
	if(type.equalsIgnoreCase("Vip")) 
	{
		System.out.println("Enter Special access:");
		String access=sc.nextLine();
		System.out.println("Vip Ticket:");
		VipTicket vip=new VipTicket(event, no, price, access);
		vip.setEventName(event);
		vip.setSeatNumber(no);
		vip.setPrice(price);
		vip.setSpecialAccess(access);
		vip.displayDetails();
		
	}
	else if(type.equalsIgnoreCase("stud"))

	{

		System.out.println("Enter Student Discount:");
		boolean dis=sc.nextBoolean();
		System.out.println("Student Ticket:");
		StudentTicket stude=new StudentTicket(event, no, price, dis);
		stude.setEventName(event);
		stude.setSeatNumber(no);
		stude.setPrice(price);
		stude.setStudentDiscount(dis);
		stude.displayDetails();
		
}
	else 
	{
		System.out.println("Regular Ticket:");
		Ticket ticket=new Ticket(event, no, price);
		ticket.setEventName(event);

		ticket.setSeatNumber(no);
		ticket.setPrice(price);
		ticket.displayDetails();
		
		
		
	}
	sc.close();
}
	

}
