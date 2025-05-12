package com.Task15Octo;
import java.util.*;
public class Task
{
	private String title;
	private String description;
	private String priority;
	private boolean completed;
	
	public Task(String title, String description, String priority,boolean completed )
	{
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed=completed;
	}
	
	public static Task getTaskObject() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Task Title:");
		String name=sc.nextLine();
		if(name.isEmpty()||name==null) {
			System.err.println("Errroe! Title cannot be Empty");
			System.exit(0);
		}
		System.out.println("Enter Task Description:");
		String description1=sc.nextLine();
		if(description1.isEmpty()||description1==null) {
			System.err.println("Errroe! Does not Allowed A Empty Description!");
			System.exit(0);
		}
		System.out.println("Enter Task Priority: ");
		String priority1=sc.nextLine();
		if(priority1.isEmpty()||priority1==null) {
			System.err.println("!yupp You have to Enter Priority");
			System.exit(0);
		}
		System.out.println("Is Task Completed?:");
		boolean b1=sc.nextBoolean();
		return new Task(name,description1,priority1,b1);
		
		
	}
	
	//Update Methods
	public void updateDesctiption() 
	{
		this.description=description;
	}
	public void updatePriority()
	{
		this.priority=priority;
		
	}
	
	public void markAsCompleted()
	{
		this.completed=completed;
	}

	
		
	
	//Getter Method
	
	public void getTitle()
	{
		this.title=title;
	}
	public String getDescription() {
		return description;
	}

	public String getPriority() {
		return priority;
	}

	public boolean isCompleted() {
		return completed;
	}

	@Override
	public String toString() {
		return "Task [title=" + title + ", description=" + description + ", priority=" + priority + ", completed="
				+ completed + "]";
	}

	
	
	
		
	

}
