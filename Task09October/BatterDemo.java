package com.Task09October;
import java.util.*;
public class BatterDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter name of the Player");
		String name=sc.nextLine();
		System.out.println("ENter Runs of the Player");
		int runs =sc.nextInt();
		System.out.println("ENter matches of the player");
		int matches=sc.nextInt();
		Batter b1=new Batter(name,runs,matches);
	b1.computeBattingAverage();
	b1.getStatistics();
	sc.close();
		
	}

}
