package com.Task24October;
public class scienceStudent extends Student 
{
	private int physicsMarks;
	 private int chemistryMarks;
	 private int mathMarks;
	public scienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	public double calculatePercentanage(int physicsMarks, int chemistryMarks,int mathMarks) 
	{
		double percentage=(physicsMarks+chemistryMarks+mathMarks)/3;
		return percentage;
		
	}
	
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public int getMathMarks() {
		return mathMarks;
	}
	public void setPhysicsMarks(int physicsMarks)
	{
		if(physicsMarks<=0) 
		{
			System.err.println("Physics Marks must not be zero or negative!");
			System.exit(0);
		}
		else 
		{
			this.physicsMarks = physicsMarks;
			
		}
		
	}
	public void setChemistryMarks(int chemistryMarks) 
	{
		if(chemistryMarks<=0) 
	{
			System.err.println("Chemistry Marks Must not be Zero or Negative!");
			System.exit(0);
	}
		else 
		{
			this.chemistryMarks = chemistryMarks;
		}
		
	}
	public void setMathMarks(int mathMarks)
	{
		if(mathMarks<=0) 
		{
			System.err.println("Math marks Must not be Zero or Negative!");
			System.exit(0);
			
		}
		else 
		{
			this.mathMarks = mathMarks;	
		}
		
	}
	public void displayDetails()
	{
//		System.out.println(" Studnet Name :"+this.name);
//		System.out.println("Roll Number"+this.rollNumber);
		super.displayDetails();
		System.out.println("Physics marks"+this.physicsMarks);
		System.out.println("Chemistry Marks:"+this.chemistryMarks);
		System.out.println("Math Marks:"+this.mathMarks);
		
	}
	 
	
	 
	 
	
}
