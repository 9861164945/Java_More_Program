package com.Task09October;
//elc
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter FirstName:");
String fname=sc.nextLine();
System.out.println("Enter LasttName:");
String lname=sc.nextLine();
sc.nextLine();
System.out.println("Enter EmployeeID:");
int  eId=sc.nextInt();
System.out.println("Enter Salary");
double salary=sc.nextDouble();
System.out.println("Enter No Of Project");
int noOfPro=sc.nextInt();

Employee e1=new Employee(fname,lname,eId,salary);
e1.calculateSalary(noOfPro);
sc.close();
	}
}
