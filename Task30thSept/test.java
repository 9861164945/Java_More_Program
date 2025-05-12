package com.Task30thSept;

public class test
 {
  int id=10;//Non static /instance varibale
  static int sid=101;//static variable/class level
  	
	
	public void  email(String str)//parameter variable 
	{
		int data=90;//local variable
		System.out.println(data);
		System.out.println(str);
		
	}
public static void main(String[] args) 
	{
		
		test t1=new test();
	System.out.println(t1.id);
	System.out.println(sid);
	t1.email("helo");
		
		
		
		
	}

}
