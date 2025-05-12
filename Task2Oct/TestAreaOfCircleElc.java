package com.Task2Oct;
import java.util.*;

public class TestAreaOfCircleElc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter radius:");
		double radius=sc.nextDouble();
		String area = AreaOfCircleBlc.getArea(radius);
		System.out.println("Area of the circle is:"+area);
sc.close();
	}

}
