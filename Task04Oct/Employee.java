package com.Task04Oct;
import java.util.*;
public class Employee {

	Scanner sc=new Scanner(System.in);
	int  employeeId;
	String employeeName;
	double employeeSalary;
	public void setEmployeeData() {
		System.out.println("Enter EmployeeId:");
		employeeId=sc.nextInt();
		System.out.println("ENter EmployeeName:");
		employeeName=sc.nextLine();
		sc.nextLine();
		System.out.println("ENter EmployeeSalry:");
		employeeSalary=sc.nextDouble();
		sc.close();
		
	}
	public void getEmployeeData() {
		System.out.println("Employee Id is:"+employeeId);
		System.out.println("Employee Name is:"+employeeName);
		System.out.println("Employee Salary is:"+employeeSalary);
		
	}
}
