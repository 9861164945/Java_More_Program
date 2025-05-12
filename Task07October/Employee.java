package com.Task07October;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	
public void setEmployee(String firstName,String lastName,int employeeId,double salary,int noOfProject) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.employeeId=employeeId;
	this.noOfProject=noOfProject;
	this.salary=salary;
	
	
}
public void calculateSalary(){
	if(this.noOfProject>5&&this.noOfProject<10) {
		this.salary+=5000;
	}
	else if(this.noOfProject>10&&this.noOfProject<20) {
		this.salary+=10000;
	}
	else {
		this.salary+=15000;
	}
}


@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", salary="
			+ salary + ", noOfProject=" + noOfProject + "]";
}

	
	
	

}
