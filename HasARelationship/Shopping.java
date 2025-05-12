package com.HasARelationship;
import java.util.*;
public class Shopping
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OrderId");
		String orderId=sc.nextLine();
		System.out.println("Enter ProductName:");
		String productName=sc.nextLine();
		Order order=new Order(orderId,productName);
		order.setOrderId(orderId);
		order.setProductName(productName);
		System.out.println(order);
		
		
		System.out.println("ENter Customer Name:");
		String name=sc.nextLine();
		System.out.println("ENter Customer Email");
		String email=sc.nextLine();
		 Customer c=new Customer(name,email,order);
		 c.setEmail(email);
		 c.setName(name);
		 System.out.println(c);
		 sc.close();
		
		
		
		
	}

}
