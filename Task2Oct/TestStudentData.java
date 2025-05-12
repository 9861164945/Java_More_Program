package com.Task2Oct;
import java.util.*;

public class TestStudentData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Roll:");
		int roll=sc.nextInt();
		
		System.out.println("Enter name of the student:");
		sc.nextLine();
		String name=sc.nextLine();
		
		
		System.out.print("Enter fees:");
		double  fees=sc.nextDouble();
		
		
		String studentDetails = StudentDataBlc.getStudentDetails(roll, name, fees);
		System.out.println(studentDetails);
		sc.close();

	}

}
