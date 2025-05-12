package com.Task30thSept;

import java.util.Scanner;

public class AllEvenFrom1To100 {

	public static void main(String[] args) {
Scanner in =new Scanner(System.in);
System.out.println("Enter the range:");
int n=in.nextInt();
for(int i=1;i<=n;i++) {
	if(i%2==0) {
		System.out.println("Even nos are:"+i);
		
	}
	else {
		System.out.println("odd Nos are:"+i);
	}
	
	
}


	}

}
