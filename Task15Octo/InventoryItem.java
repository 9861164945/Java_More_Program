package com.Task15Octo;
import java.util.*;
public class InventoryItem
{
	private String itemName;
	private double pricePerUnit;
	private int quantityInStock;
	public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) 
	{
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
	}
	public static InventoryItem getInventoryItemObject() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Item Name:");
		String name=sc.nextLine();
		if(name==null||name.isEmpty()) {
			System.err.println("Name can not be Empty:");
			System.exit(0);
		
		}
		System.out.println("Enter PricePerUnit");
		double price=sc.nextDouble();
		if(price<=0) {
			System.err.println("Price CanNot be Negative or Zero");
			System.exit(0);
		}
		System.out.println("Enter qty in Stock");
		int stock=sc.nextInt();
		if(stock<=0) {
			System.err.println("Stocks Can not be negative or Zero");
			System.exit(0);
		}
		return  new InventoryItem(name,price,stock);
		
	}
	
	
	
	
	
	public String getItemName() 
	{
		return itemName;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public double getPricePerUnit() 
	{
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) 
	{
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityInStock()
	{
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock)
	{
		this.quantityInStock = quantityInStock;
	}
	
	public double calculateTotalPrice() 
	{
		double price=this.pricePerUnit*this.quantityInStock;
		return price;
		
	}
	@Override
	public String toString() {
		return "InventoryItem [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", quantityInStock="
				+ quantityInStock + ", totalPrice=" + calculateTotalPrice() + "]";
	}
	
}
