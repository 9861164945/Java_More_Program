package com.Task07October;

public class Student {
	
	private int studentId;
	private  String studentName;
	private  int marks;
	private char grade;
	
	public void setStudent(int studentId,String studentName,int marks) 
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
	
		
	}

	public void calculateGrade() {
		if(this.marks<=90 &&this.marks>=80) {
			this.grade='A';
		}
		else if(this.marks<80 &&this.marks>=70) {
			this.grade='B';
	}
		else if(this.marks<70 &&this.marks>=60) {
			
		this.grade='C';	
		}
		else if(this.marks<60&&this.marks>=50) {
			this.grade='D';
			
		}
		else {
			this.grade='F';
		}
		
		
		
		}
	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
	
	

}
