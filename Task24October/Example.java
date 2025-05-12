package com.Task24October;

public class Example 
{
	int x=m1();
	int m1() {
		System.out.println("Non static variable 1 is executed!");
		return 10;
	}
	{
		System.out.println("Non static Block 1 is executed!");
	}
	Example(){
		System.out.println("Non parameterized Constructor is executed!");
	}
	Example(String c){
		System.out.println("String Type Parameterized Constructor!");
	}
	{
		System.out.println("Non Static Block 2 Executed!");
	}
	
	int y =m2();
	int m2() {
		System.out.println("Non static Variable 2 Executed");
		return 20;
	}
	
	
	public static void main(String args[]) 
	{
		System.out.println("Main Method Execution Started!");
		Example t1=new Example();
		System.out.println("-----------***************-------------- -");
		Example t2=new Example();
		System.out.println("Main Method Ended");
		
		
	}
	int z=m3();
	int m3() 
	{

		System.out.println("Non Static variable 3 Executed");
		return 30;
	}
	
	{
		System.out.println("Non static Block 3 is Executed ! ");
		
		
	}
	void m4() 
	{
		System.out.println("Non Static Method Executed!");
		
	}
}

