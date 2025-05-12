package com.Task23Sept;

public class ConvertingNumberofDaysToYearFormat {
public static void main(String args[]) {
	int noOfDays=Integer.parseInt(args[0]);
	int year=noOfDays/365;
	int month=(noOfDays%365)/30;
	int week=((noOfDays%365)%30)/7;
	int day=((noOfDays%365)/30)%7;
	System.out.println(noOfDays+"Day:"+year+"year"+month+"months"+week+"weekss"+day+"day");


	
}
}
