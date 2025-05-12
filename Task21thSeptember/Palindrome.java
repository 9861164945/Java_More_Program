package com.Task21thSeptember;
/*
 * 121 */
public class Palindrome {

	public static void main(String[] args) {
	//Input usijng Command prompt
		int number=Integer.parseInt(args[0]);
	int revNum=0;
	int temp=number;
	while(temp!=0) {
		int rem=temp%10;
	  revNum=revNum*10+rem;
		temp=temp/10;
		
		}
	
	
	
	System.out.println("reverse"+revNum);
	
	if(number==revNum) {
		System.out.println(number+" is a Palindrome Number");

	}
	else {
		System.out.println(number+"is not a Palindrome Number");
	}
	}

}
