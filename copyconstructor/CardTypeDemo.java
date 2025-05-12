package com.copyconstructor;
import java.util.*;

public class CardTypeDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Customer Name:");
		String name=sc.nextLine();
		System.out.println("Enter CreditPoints:");
		int point=sc.nextInt();
		Customer c1=new Customer(name,point);
		CardType offeredCard = CardsOnOffer.getOfferedCard(c1);
		System.out.println(offeredCard);
		sc.close();
	}

}
