package com.sambitpraticewithnotes.oops;

public class CarEncap 
{
	private String color;
	private String model;
	private double fuel;
	private long costOfPurchace;
	
	
	
	
	
	 public CarEncap(String color, String model, double fuel, long costOfPurchace) {
		super();
		this.color = color;
		this.model = model;
		this.fuel = fuel;
		this.costOfPurchace = costOfPurchace;
	}
	 
	public String getColour() {
		return color;
	}
	 public void setColor(String color)
	 {if(color.equals("pink")) {
		 System.out.println("chutia");
	 }
	 else {
		 this.color=color;
			 
	 }
		
	 }
	 public String getModel() {
		 return model;
	 }
	 public void setModel(String model )
	 {
		 if(model.equals("Maruti Suzuki")) {
			 System.out.println("your Car is Old Model U have to replace it");
		 }
		 else {
			 this.model=model;
				 
		 }
		  }
	
	
	 @Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", fuel=" + fuel + ", costOfPurchace=" + costOfPurchace
				+ "]";
	}
	
	
	
}
