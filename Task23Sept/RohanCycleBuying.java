package com.Task23Sept;

public class RohanCycleBuying {

	public static void main(String[] args) {
	int oldPrice=Integer.parseInt(args[0]);
	int repairPrice=Integer.parseInt(args[1]);
	int coloringPrice=Integer.parseInt(args[2]);
	int accessoriesPrice=Integer.parseInt(args[3]);
	System.out.println("Cycle Old Price:"+oldPrice);
	System.out.println("Cycle Repair Price:"+repairPrice);
	System.out.println("Cycle Coloring Price:"+coloringPrice);
	System.out.println("Cycle accessoriesPrice:"+accessoriesPrice);
	int totalBuyingPrice=oldPrice+ repairPrice+coloringPrice+accessoriesPrice;
	System.out.println();
	int wantedprofit=Integer.parseInt(args[4]);
	System.out.println("Wanted Profit="+wantedprofit);
	int sellingPrice=totalBuyingPrice+wantedprofit;
	System.out.println("total selling Price:"+sellingPrice);

	}

}
