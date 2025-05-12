package com.Task24October;

public class Student 
{
	protected String name;
	protected int rollNumber;
	

	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	
	
	

	public String getName() {
		return name;
	}





	public int getRollNumber() {
		return rollNumber;
	}





	public void setName(String name)
	{
		if(name.isEmpty()||name==null) 
		{
			System.err.println("Name Can not Be Empty!");
			
		}
		
		else
		{
			this.name = name;
			
		}
		
	}





	public void setRollNumber(int rollNumber)
	{
		if(rollNumber<=0) 
		{
			System.err.println("Roll Number Must be Negative");
			
		}
		else
		{
			this.rollNumber = rollNumber;		
		}
	}





	public void displayDetails()
	{
		System.out.println("Studnet Name :"+this.name);
		System.out.println("Roll Number"+this.rollNumber);
		
	}


}
