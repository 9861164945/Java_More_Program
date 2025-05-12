package com.copyconstructortask18oct;
import java.util.*;
public class StudentDemo
{
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter name of the Student:");
		
		String name=sc.nextLine();
		System.out.println("Enter Student Id: ");
		int id=sc.nextInt();
		System.out.println("Enter  Course Of the Student:");
		sc.nextLine();
		String courseName=sc.nextLine();
		System.out.println("ENter fees Of the Student:");
		double fees=sc.nextDouble();
		System.out.println("Enter Average of the Student:");
		double avg=sc.nextInt();
		
		Student s1=new Student(name,id,courseName,fees,avg);
		s1.setName(name);
		s1.setId(id);
		s1.setCourse(courseName);
		s1.setFee(fees);
		s1.setAverage(avg);
		s1.calculateGrade(avg);
		
		System.out.println(s1);
		sc.close();
		}

}
