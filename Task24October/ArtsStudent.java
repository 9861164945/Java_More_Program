package com.Task24October;

public class ArtsStudent extends Student
{
 
	private int historyMarks;
	private int geographyMrks;
	private int englishMarks;
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMrks, int englishMarks) {
		super(name, rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMrks = geographyMrks;
		this.englishMarks = englishMarks;
	}
	
	public double calculatePercentange(int historyMarks,int geographyMrks,int englishMarks)
	{
		double percentage=(historyMarks+geographyMrks+englishMarks)/3;
		return percentage;	
	}
	
	public int getHistoryMarks()
	{
		return historyMarks;
	}

	public int getGeographyMrks()
	{
		return geographyMrks;
	}

	public int getEnglishMarks() 
	{
		return englishMarks;
	}

	public void setHistoryMarks(int historyMarks) 
	{
		if(historyMarks<=0) 
	{
		System.err.println("History Marks must not be zero or negative!");
		System.exit(0);
	}
		else 
		{
			this.historyMarks = historyMarks;
		}
		
	}

	public void setGeographyMrks(int geographyMrks) 
	{
		if(geographyMrks<=0) 
	{
			System.err.println("Geography Marks must not Be Zero or negative");
			System.exit(0);
		
	}
		else 
		{
			this.geographyMrks = geographyMrks;
		}
		
	}

	public void setEnglishMarks(int englishMarks)
	{
		if(englishMarks<=0) 
		{
			System.err.println("English Marks Must not be Zero or negative!");
			System.exit(0);
			
		}
		else
		{
			this.englishMarks = englishMarks;
		}
		
	}

	public void displayDetails()
	{
//		System.out.println(" Student Name :"+this.name);
//		System.out.println("Roll Number"+this.rollNumber);
		super.displayDetails();
		System.out.println("History marks"+this.historyMarks);
		System.out.println("Geography  Marks:"+this.geographyMrks);
		System.out.println("English Marks:"+this.englishMarks);
		
	}



}
