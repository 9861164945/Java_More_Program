package com.sambitpraticewithnotes;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		
		
		/*
		 * What is Array?
		 * Array is a collection of same type object
		 *how to  declare an Array
		 *int [] nums=new int[size];
		 *
		 **/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int n=sc.nextInt();
		int []num1=new int[n];
		System.out.println("Enter elements into the Array:");
		for(int i=0;i<n;i++) {
			num1[i]=sc.nextInt();
			}
		
		System.out.println("Original Array: " + Arrays.toString(num1));
		//forFethcing the 1 st index
		System.out.println(num1[0]);
		
	}

}
