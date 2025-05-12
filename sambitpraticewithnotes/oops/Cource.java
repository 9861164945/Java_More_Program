package com.sambitpraticewithnotes.oops;

public class Cource {

	
	int noOfEnrollment;
	String courseName;
	
	
	
	public Cource(int noOfEnrollment, String courseName) {
		super();
		this.noOfEnrollment = noOfEnrollment;
		this.courseName = courseName;
	}

	


	@Override
	public String toString() {
		return "Cource [noOfEnrollment=" + noOfEnrollment + ", courseName=" + courseName + "]";
	}




	public static void main(String[] args) {
		Cource c1=new Cource(1,"java");
		System.out.println(c1);
	}

}
