package com.Task04Oct;

import java.util.*;
public class Sambit {
	
	String myName;
	int age;
	String roleInTeam;
	boolean isWicketKeeper;
	int runs;
	int wickets;
	int catches;
	int stumping;
	double battingAverage;
	double bowlingAverage;
	double strikeRate;
	int highScore;
	int bestBowl;
	 public void setData()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Name:");
		 myName=sc.nextLine();
		 System.out.println("Enter Age:");
		 age=sc.nextInt();
		 sc.nextLine();
		 System.out.println("ENter Your Role in Team:");
		 roleInTeam=sc.nextLine();
		 
		 System.out.println("Are u a wicketKeeper");
		 isWicketKeeper=sc.nextBoolean();
		 System.out.println("Enter Your Runs");
		 runs=sc.nextInt();
		 System.out.println("Enter Wickets:");
		 wickets=sc.nextInt();
		 System.out.println("Enter catches");
		 catches=sc.nextInt();
		 System.out.println("Enter Stumping");
		 stumping=sc.nextInt();
		 System.out.println("Enter batting Average:");
		 battingAverage=sc.nextDouble();
		 
		 System.out.println("Enter bowling Average:");
		 bowlingAverage=sc.nextDouble();
		 
		 System.out.println("Enter Strike Rate:");
		 strikeRate=sc.nextDouble();

		 System.out.println("Enter Your HighestScore:");
		 highScore=sc.nextInt();
		 
		 

		 System.out.println("Enter Your BestBowling:");
		 bestBowl=sc.nextInt();
		 		 
		 sc.close();
	 }
	 
	 public void getData() {
		 
		 System.out.println("My Name is:"+myName);
		 System.out.println("My age is:"+age);
		 System.out.println("I am a"+roleInTeam);
		 System.out.println("I am a Wicketkeeper"+isWicketKeeper);
		 System.out.println("I scored these much runs:"+runs);
		 System.out.println("I take these much wickets:"+wickets);
		 System.out.println("I catch these much"+catches);
		 System.out.println("Also i am a wicket keeper i make these muh of  Stumping:"+stumping);
		 System.out.println("My batting Avg is:"+battingAverage);
		 System.out.println("My Bowling Avg is:"+bowlingAverage);
		 
		 System.out.println("My Strike Rate is"+strikeRate);
		 
		 System.out.println("My HighestScore is:"+highScore);
		 System.out.println("My highest wicket Taken in a Single match:"+bestBowl);
	 }
	 
	 
	 
	
	
	

}
