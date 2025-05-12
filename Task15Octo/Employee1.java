package com.Task15Octo;
import java.util.*;
public class Employee1 
{
	private String name;
	private int age;
	private  String department;
	private double salary;
	private String performance;
	//1public double incresalary=0.0;
	public Employee1(String name, int age, String department, double salary, String performance)
	{
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.performance = performance;
	}
	public  static Employee1 getEmployeeObject() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Employee:");
		 String name1=sc.nextLine();
		 if(name1.isEmpty()||name1==null)
		 {
			 System.err.println("Error ! Name Can not be Empty:");
			 System.exit(0);
		 }
		System.out.println("Enter the age of the Employee:(non-negative):");
		int age1=sc.nextInt();
		if(age1<=0) 
		{
			System.err.println("Error! Age must be a Positive Number:");
			System.exit(0);
		}
		
		System.out.println("Enter the departmentName of the Employee:");
		sc.nextLine();
		String department1=sc.nextLine();
		if(department1.isEmpty()||department1==null)
		{
			System.err.println("Error! Department Should not be  a Empty String");
			System.exit(0);
		}
		System.out.println("ENter Salary Of the  Employee:(non-negative):");
		double salary1=sc.nextDouble();
		if(salary1<=0)
		{
			System.err.println(" Error! Salary Must  be a Positive Number");
		}
		System.out.println("Enter Performance grade of the Employee:");
		sc.nextLine();
	    String performance1 =sc.nextLine();
	    return new Employee1(name1,age1,department1,salary1,performance1);
	
	}
public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		if (name==null||name=="") 
	{

			System.err.println("Error Name Cannot be Empty");
			System.exit(0);
		
			
	}
		else
		{
			this.name = name;
		}
		}
	public int getAge() {
		return age;
	}
	public void setAge(int age)
	{
		if(age<0) {
			System.err.println("You have to input a valid age");
			System.exit(0);
		}
		else 
		{
			this.age = age;
				
		}
		}
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	
	public double updateSalary()
	{ 
		 
		if(performance.equals("good")||performance.equals("GOOD")) 
		{
			salary+=10000;
		}
		else if(performance.equals("average")||performance.equals("AVERAGE")) {
			salary+=5000;
		}
		else {
			salary+=0;
		}
		return salary;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
				+ ", performance=" + performance +"]";
	}
	 

	
}
