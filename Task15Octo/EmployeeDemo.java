package com.Task15Octo;
import java.util.*;

import com.Task14October.Employee;
public class EmployeeDemo
{
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
		System.out.println("How many objects:");
		int noOfObjects=sc.nextInt();
		for(int i=1;i<=noOfObjects;i++) {
			Employee1 obj=Employee1.getEmployeeObject();
			//obj.setName(name);
			obj.updateSalary();
		System.out.println(obj);	
		 } 
		
	}

}
