package com.Task30thSept;
import java.util.*;

public class SumOfFirstnNaturalNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Range :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of natural Number from 1 to"+n+"="+sum);
		
	}

}
