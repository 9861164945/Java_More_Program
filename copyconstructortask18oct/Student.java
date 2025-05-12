package com.copyconstructortask18oct;

public class Student 
{
	//non st=atic INstance Variable;
	private String name;
	private int id;
	private String course;
	private double fee;
	private char grade;
	private  double average;
	public Student(String name, int id, String course, double fee,double average)
	{
		super();
		this.name = name;
		this.id = id;
		this.course = course;
		this.fee = fee;
		
		this.average=average;
		this.grade = calculateGrade(average);
	}
	
	public Student(Student obj) {
        this.name = obj.name;
        this.id = obj.id;
        this.course = obj.course;
        this.fee = obj.fee;
        this.average =obj.average;
        this.grade = obj.grade;
    }
	
	
	
public String getName() {
		return name;
	}





	public int getId() {
		return id;
	}





	public String getCourse() {
		return course;
	}





	public double getFee() {
		return fee;
	}





	public char getGrade() {
		return grade;
	}





	public double getAverage() {
		return average;
	}





	public void setName(String name) 
	{
		if(name==null||name.isEmpty()) 
	{
			System.err.println("Name Can not be Empty!");
			System.exit(0);
		
	}
		else
		{
			this.name = name;
				
		}
	}





	public void setId(int id)
	{ 
		if(id<=0) 
	{
		System.err.println("Id can not  be Zero or Negative");
		System.exit(0);
	}
	else 
	{
		
		this.id = id;
	}
	
	
	}





	public void setCourse(String course)
	{
		if(course==null|| course.isEmpty()) {
			System.err.println("Course Can not be Empty:");
			System.exit(0);
		}
		this.course = course;
	}





	public void setFee(double fee) 
	{
		if(fee<=0) 
		{
			System.err.println("Fee can not be Zero Or Negative Number");
			System.exit(0);
			
		}
		else 
		{

			this.fee = fee;	
		}
		
		}





	public void setGrade(char grade) 
	{ 
		if(grade>='A' && grade<='F'||grade>='a' && grade<='f')
		{
			this.grade = grade;
		}
		else {
			System.err.println("Grade can not be Empty!");
		}
		
	}





	public void setAverage(double average) 
	{
		if(average<=0) 
		{
			System.err.println("Error: Average Mark must be Between 0 and 100.");
			System.exit(0);
		}
		else 
		{

			this.average = average;
		
			
		}
		}





	public char calculateGrade(double average) 
	{
		
		
		
	    if (average >= 90&&average<100) {
	        return 'A';
	    } else if (average >= 80||average<90) {
	        return 'B';
	    } else if (average >= 70||average<80) {
	        return 'C';
	    } else if (average >= 60||average<70) {
	        return 'D';
	    } else {
	        return 'F';
	    }
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + ", fee=" + fee + ", grade=" + grade
				+ ", average=" + average + "]";
	}
	
	

	
	
	
}

