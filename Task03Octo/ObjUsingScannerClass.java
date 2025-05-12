package com.Task03Octo;

import java.util.*;


public class ObjUsingScannerClass {
	public static void main(String[] args) {
		ObjS obj=new ObjS();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		obj.name=sc.nextLine();
		System.out.println("Enter your Height");
		obj.height=sc.nextDouble();
		System.out.println("ENter your Age");
		obj.age=sc.nextInt();
		System.out.println("Are u a Madua");
		obj.madua=sc.nextBoolean();
		
		obj.getUserDetails();
		
		
		
	}

}
