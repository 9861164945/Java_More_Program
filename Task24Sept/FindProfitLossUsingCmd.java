package com.Task24Sept;

public class FindProfitLossUsingCmd {

	public static void main(String[] args) {
		double costPrice=Double.parseDouble(args[0]);
		
		double sellingPrice=Double.parseDouble(args[1]);
		System.out.println("Cost price is"+costPrice);
		System.out.println("Selling Price is:"+sellingPrice);
		if(costPrice>sellingPrice) {
			 double loss=costPrice-sellingPrice;
			 double lossPercentage=(loss/costPrice)*100;
			 System.out.println("Loss is:"+loss);
			 System.out.println("Loss percentage is:"+lossPercentage+"%");
		}
		else if(costPrice<sellingPrice) {
			double profit=sellingPrice-costPrice;
			 double profitPercentage=(profit/costPrice)*100;
	System.out.println("Profit Is:"+profit);
	System.out.println("Profit Percentage is:"+profitPercentage+"%");
		}
		else {
			System.out.println("You Have No Profit No Loss:");
		}
		  
		
		
	}

}
