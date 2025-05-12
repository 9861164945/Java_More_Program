package com.Task07October;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		System.out.println("Enter FirstName of the Employee: ");
		String fname=sc.nextLine();
		System.out.println("Enter LastName of the Employee");
		String lname=sc.nextLine();
		System.out.println("Enter EnployeeId of the Employee");
		int eid=sc.nextInt();
		System.out.println("Enter No of project of the Employee");
		int noOfPro=sc.nextInt();
		System.out.println("Enter Salary of the Employee");
		double salary=sc.nextDouble();
		e1.setEmployee(fname, lname, eid, salary, noOfPro);
		e1.calculateSalary();
		System.out.println(e1.toString());
		}

}
