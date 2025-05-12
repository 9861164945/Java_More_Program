package com.Task20thSeptember;

public class TwoDigitSumOfDigit {
public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	if(num>=10 && num<=99) {
		
	int digit1=num/10;
	int digit2=num%10;
	int sum=digit1+digit2;
	System.out.println(num+"="+digit1+"+"+digit2+"="+sum);
}
	else {
		System.out.println("Please Input a Valid Two Digit Number");
	}
}

}
