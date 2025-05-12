package com.Task14October;
import java.util.*;
public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public static Employee getEmployeeObject() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id non-negative:");
		int id=sc.nextInt();
		if(id<=0) {
			System.err.println("Invalid Input Id must Not be Negative or zero:");
			System.exit(0);
		}
		System.out.println("Enter Employee Name Non-Empty:");
		sc.nextLine();
		String name=sc.nextLine();
		
		if(name==null ||name=="") {
			System.err.println("Invalid Input name must Not be a Empty string:");
			System.exit(0);
		}
		System.out.println("Enter Employee Salary non-negative:");
		double salary=sc.nextDouble();
		if(salary<=0) {
			System.err.println("Invalid Input Salary must Not be Negative or zero:");
			System.exit(0);
		}
		
		return new Employee(id,name,salary);
			
		
	}
	
	
	
	
	
	
	
	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	
	
	

}
