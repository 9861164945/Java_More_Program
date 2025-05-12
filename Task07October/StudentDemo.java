package com.Task07October;
import java.util.*;
public class StudentDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student s1=new Student();
	System.out.println("Enter Roll number");
	int roll=sc.nextInt();
	System.out.println("ENter The Student Name:");
	String name=sc.nextLine();
	sc.nextLine();
	System.out.println("ENter the marks of the Student :");
	int marks=sc.nextInt();
	s1.setStudent(roll, name, marks);

	s1.calculateGrade();
	
		System.out.println("Student Details:"+s1.toString());

	}

}
