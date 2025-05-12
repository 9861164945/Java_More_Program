package com.sambitpraticewithnotes;

public class ObjectOrientedProgramming {

	public static void main(String[] args) {
		
		//object oriented programming
		
		//Object 
		/*
		 *what is object?;
		 *object has property and behaviour/method;
		 *whatever i know property and whatever i do that is behaviour
		 *object is a real world entity;example:pen,paper,mercedes;
		 *Every thing is object;
		 *when  u think to add two nos u have to think all re object
		 *who creates object in java?jvm(Java Virtual Machine);
		 *designing of your object  by jvm(Java Virtual Machine);
		 
		 **/
		//class
		/*
		 * it is nothing but collection of objects 
		 * */
		
		int a=3;int b=9;
	int sum=a+b;
	System.out.println(sum); 
	Calculator calc=new Calculator();//Creating a new Object;
	
	
	calc.add(23,11);//object Call
	calc.get();

	}

}
class Calculator{
	int n;
	public int add(int x,int y) {
		System.out.println("in add");
		int r=x+y;
		System.out.println(r);
		
		return r;
	}
	public boolean get() {
		return true;
	}
}



/* to compile your java program we need JDK it is the top level.
 * JVM(java virtual machine) Is the machine to run the code button;
 * JRE Java Runtime Environment.it is a part of jvm and top.
 * 
 * */

