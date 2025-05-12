package com.Task14October;
import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many objects");
		int noOfObjects=sc.nextInt();
		for(int i=1;i<=noOfObjects;i++) {
			Employee obj=Employee.getEmployeeObject();
		System.out.println(obj);	
		}
		
		
		
	}
}
