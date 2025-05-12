package com.HasARelationship;

public class Customer 
{
	private String name;
	private String email;
	private Order order;
	public Customer(String name, String email, Order order) {
		super();
		this.name = name;
		this.email = email;
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Order getOrder() {
		return order;
	}
	public void setName(String name) 
	{
		if(name.isEmpty()) 
		{
			System.err.println("Name can not be Empty!");
		}
		else
		{
			this.name = name;	
		}
		
	}
	public void setEmail(String email) 
	{
		if(email.isEmpty()) 
		{
			System.err.println("Email Can not be Empty!");
			
		}
		else 
		{
			this.email = email;
		}
		
	}
	public void setOrder(Order order)
	{
		
			this.order = order;
		
		
	}
	@Override
	public String toString() 
	{
		return "Customer [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
	
	 
}
