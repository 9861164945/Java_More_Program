package com.Task09October;

//blc
public class Employee {

	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	public Employee(String firstName, String lastName, int employeeId, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;

	}
	
	public void calculateSalary(int noOfProject)
	
	{
        if(noOfProject>0) {
        	this.noOfProject=noOfProject;
        	 if(this.noOfProject>5&&this.noOfProject<10) {
 				this.salary+=5000;
 				System.out.println("Salary remains :"+salary);
 			}
 			else if(this.noOfProject>10&&this.noOfProject<20) {
 				this.salary+=10000;
 				System.out.println("Salary remains :"+salary);
 			}
 			else {
 				this.salary+=15000;
 				System.out.println("Salary remains :"+salary);
 			}	
	}else
	{
	     System.err.println("Negative is not possible"+this.noOfProject); 
	    System.out.println("Salary remains :"+salary);
	    
	}
	}
	
	
		
		
		
		
	


	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}
	
	
	
}


