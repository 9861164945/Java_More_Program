package com.sambitpraticewithnotes.oops;

public class Bike 
{
	int noOfwheel;
	String color;
	double price;
	
	
	//Non parameterized  Constructor created by user
	Bike()
	{
		noOfwheel=2;
		color="Red";
		price=89023.90;
	}
	
	//Parameterized constructor Created by user;
	Bike(int noOfwheel,String color,double price)
	{
	
		this.noOfwheel=noOfwheel;
		this.color=color;
		this.price=price;
	}
	 
	

	public String toString()
	
	{
	
		return "Bike [noOfwheel=" + noOfwheel + ", color=" + color + ", price=" + price + "]";
	}


	public static void main(String[] args)
	{
	
		Bike pulsor=new Bike(2,"black",89023.90);
		System.out.println(pulsor);
		Bike apache=new Bike(2,"white",90000);
		System.err.println(apache);
		
    }

}
