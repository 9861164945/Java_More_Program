package com.Task24October;
import java.util.Scanner;
public class StudentDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student  Name:");
		String name=sc.nextLine();
		System.out.println("Enter Studnet Roll no:");
		int roll=sc.nextInt();
		System.out.println("Enter Branch:");
		sc.nextLine();
		String branch=sc.nextLine();
		if(branch.equalsIgnoreCase("science")) 
		{
			System.out.println("Enter Physics marks:");
			int pmarks=sc.nextInt();
			System.out.println("ENter  chemistry  Marks:");
			int cmarks=sc.nextInt();
			System.out.println("Enter Math marks:");
			int mmarks=sc.nextInt();
			
			scienceStudent s1=new scienceStudent(name, roll, pmarks, cmarks, mmarks);
			s1.setName(name);
			s1.setRollNumber(roll);
			s1.setPhysicsMarks(pmarks);
			s1.setChemistryMarks(cmarks);
			s1.setMathMarks(mmarks);
			
			s1.displayDetails();
			s1.calculatePercentanage(pmarks, cmarks, mmarks);
			
		}
		else if(branch.equalsIgnoreCase("Arts")) 
		{
			System.out.println("Enter History Marks:");
			int hmarks=sc.nextInt();
			System.out.println("Enter GeoGraphy Marks:");
			int gmark=sc.nextInt();
			System.out.println("ENter English Marks:");
			int emark=sc.nextInt();
			ArtsStudent a1=new ArtsStudent(name, roll, hmarks, gmark, emark);
			a1.setName(name);
			a1.setRollNumber(roll);
			a1.setHistoryMarks(hmarks);
			a1.setGeographyMrks(gmark);
			a1.setEnglishMarks(emark);
			a1.displayDetails();
			a1.calculatePercentange(hmarks, emark, emark);
			
			
		}
	
		else 
		{
			Student s1=new Student(name, roll);
			s1.setName(name);
			s1.setRollNumber(roll);
			s1.displayDetails();
		
			
		}
		
	}

}
