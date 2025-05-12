package com.Task2Oct;
import java.util.*;


public class TestEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		boolean even = EvenOdd.isEven(num);
		if(even) {
			System.out.println(num+" is EvenNumber");
			
		}
		else {
			System.out.println(num+" is oddNumber");
		}
	}

}
