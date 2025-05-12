package com.Task23Sept;

public class WholeSellerDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int netBill=Integer.parseInt(args[0]);
		double discount,discoutamt,totalPayable;
		if(netBill<5000) {
			discount=5;
			}
		else if(netBill>=5000 &&netBill<10000) {
			
			discount=10;
		}
		else {
			discount=15;
		}
		
		discoutamt=(discount/100)*netBill;
		totalPayable=netBill-discoutamt;
		 System.out.printf("Discount %%: %.0f%%%n", discount);
	        System.out.printf("Discount Amount: ₹%.2f%n", discoutamt);
	        System.out.printf("Amount Payable: ₹%.2f%n", totalPayable);
		
		
	}

}
