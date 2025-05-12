package com.Task15Octo;
import java.util.*;

public class TaskDemo {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many Objects:");
		int noOfObjects=input.nextInt();
		for(int i=1;i<=noOfObjects;i++)
		{
			Task tasks=Task.getTaskObject();
			System.out.println(tasks);
		}
		
		
		input.close();
	}

}
