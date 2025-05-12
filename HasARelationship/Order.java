package com.HasARelationship;

public class Order
{

	private String orderId;
	private String productName;
	 public Order(String orderId,String productName) 
	 {
		 super();
		 this.orderId=orderId;
		 this.productName=productName;
		 
	 }
	 
	

	public String getOrderId() {
		return orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setOrderId(String orderId) 
	{
		if(orderId.isEmpty()) 
		{
			System.err.println("Order Id can not be Empty!");
			System.exit(0);
		}
		else 
		{
			this.orderId = orderId;
		}
		
	}

	public void setProductName(String productName)
	{
		if(productName.isEmpty()) 
		{
			System.err.println("ProductName Can not be Empty");
			System.exit(0);
		}
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";
	}

}
