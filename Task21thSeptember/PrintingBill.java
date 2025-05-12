package com.Task21thSeptember;

public class PrintingBill {

	public static void main(String[] args) {
		System.out.println("Welcome to Dominos");
		System.out.println("--------------------");
		int noOfChicken=Integer.parseInt(args[0]);
		int noOfVegetablepuffs=Integer.parseInt(args[1]);
		int priceOfChicken=Integer.parseInt(args[2]);
		int priceOfvegetablepuffs=Integer.parseInt(args[3]);
		int totalChickenAmt=noOfChicken*priceOfChicken;
		int totalVegetableAmt=noOfVegetablepuffs*priceOfvegetablepuffs;
		int Total_bill=totalChickenAmt+totalVegetableAmt-50;
		System.out.println("No of Chicken Rolls:"+noOfChicken);
		System.out.println("No of Vegetable Puffs:"+noOfVegetablepuffs);
		System.out.println("Price of the Chicken Rolls:"+priceOfChicken);
		System.out.println("Price of the vegetable puffs:"+priceOfvegetablepuffs);
		System.out.println("Total Chicken amt:"+totalChickenAmt);
		System.out.println("Total vegetable Amt:"+totalVegetableAmt);
		System.out.println("Total bill  with 50 rs Discount:"+Total_bill);

	}

}
