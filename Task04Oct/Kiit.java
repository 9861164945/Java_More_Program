package com.Task04Oct;

import java.util.*;

public class Kiit {
	
	String nameOfUniversity;
	String nameOfFounder;

String location;
	int noOfSchool;
int noOfDepartment;
int noOfEmployee;
int noOfStudent;
int noOfCampus;
double placementPercentage;
public void setData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of the University:");
	nameOfUniversity=sc.nextLine();

	System.out.println("Enter name of the Founder:");
	nameOfFounder=sc.nextLine();

	System.out.println("Enter the Location:");
	location=sc.nextLine();

	System.out.println("Enter No of Deparatment:");
	noOfDepartment=sc.nextInt();
	System.out.println("Enter NoOfEmployee:");
	noOfEmployee=sc.nextInt();
	System.out.println("Enter NoOf students:");
	noOfStudent=sc.nextInt();
	System.out.println("ENter no of Campus:");
	noOfCampus=sc.nextInt();
System.out.println("ENter Placemant percenntage");
placementPercentage=sc.nextDouble();
	
		
}

//System.out.println("----------------------------------------------------");


public void getData() {
	System.out.println("The Name of the University is:"+nameOfUniversity);
	System.out.println("The Name of the Founder is:"+nameOfFounder);
	System.out.println("Location of the University is:"+location);
	System.out.println("Number of department in  the University is:"+noOfDepartment);
	System.out.println("Number of Employee is:"+noOfEmployee);
	System.out.println("Number of Campus in  the University is:"+noOfCampus);
	System.out.println("Number of Students in  the University is:"+noOfStudent);
	
	
	System.out.println("Placement Percentage in  the University is:"+placementPercentage);
	
	
	
	
}



	
	
	
}
