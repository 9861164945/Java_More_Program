package com.sambitpraticewithnotes.oops;

public class Box {
	double l;
	double h;
	double w;
	Box(){
		this.h=-1;
		this.l=-1;
		this.w=-1;
		
	}
	
	//cube
	Box(double side){
		this.h=side;
		this.l=side;
		this.w=side;
	}
	//this was called by the sub class;
	 Box(double l,double w,double h){
		 this.l=l;
		 this.w=w;
		 this.h=h;
	 }
	
	 Box(Box old){
		 this.l=old.l;
		 this.h=old.h;
		 this.w=old.w;
		 
	 }
	 
	 public void diplayInfo() {
		 System.out.println("Running th box:");
	 }

}
