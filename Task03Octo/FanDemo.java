package com.Task03Octo;

public class FanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1=new Fan();
		f1.name="orient";
		f1.coil="Copper coil";
		f1.wings=4;
	String fanDetails = f1.fanDetails();
	System.out.println(fanDetails);
		f1.SwitchOn();
		f1.SwitchOff();
		

	}

}
