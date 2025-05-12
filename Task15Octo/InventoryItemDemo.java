 package com.Task15Octo;
import java.util.*;
public class InventoryItemDemo
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many object :");
		int noOfObject=sc.nextInt();
		for(int i=1;i<=noOfObject;i++) 
		{
			InventoryItem I1=InventoryItem.getInventoryItemObject();
			I1.calculateTotalPrice();
			System.out.println(I1);
			
		}
		sc.close();
		
		
		
	}

}
