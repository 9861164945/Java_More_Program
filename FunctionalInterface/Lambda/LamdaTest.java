package com.FunctionalInterface.Lambda;

public class LamdaTest
{
	public static void main(String[] args) 
	{
		LamdaTest t1=new LamdaTest();
		t1.printString("Sambit");
		System.out.println("---------------------");
		t1.sum(12, 30);
		
		
	}
	
	//Lambda EXpression


	private void sum(int a,int b) 
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	private void printString(String name) 
	{
		System.out.println(name);
		
	}

}
