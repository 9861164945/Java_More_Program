package com.Task23Sept;

public class ShopKeeper {

	public static void main(String[] args) {
	 double currentPrice=Integer.parseInt(args[0]);
	  double profit=currentPrice*27/100;
	  double vat=currentPrice*12.7/100;
	  double serviceCharge=currentPrice*3.87/100;
	  System.out.println("Buying Price:"+currentPrice);
	  System.out.println("Profit is:"+profit);
	  System.out.println("Vat Is :"+vat);
	  System.out.println("ServiceCharge:"+serviceCharge);
	  
	  double sellingPrice=currentPrice+profit+vat+serviceCharge;
	  
			 System.out.println("SellingPrice:"+sellingPrice);
	  
	 

	}

}
