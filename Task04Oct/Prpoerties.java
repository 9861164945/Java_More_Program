package com.Task04Oct;
import java.util.*;
public class Prpoerties {
	Scanner sc=new Scanner(System.in);
	int productId;
	String productName;
	double productPrice;
	public void setProductData() {
		System.out.println("Enter Product id:");
		productId=sc.nextInt();
		System.out.println("Enter product:");
		productName=sc.nextLine();
		sc.nextLine();
		System.out.println("ENter price:");
		productPrice=sc.nextDouble();
	}
	public void getproductInfo() {
		System.out.println("product Id is:"+productId);
		System.out.println("Product Name is :"+productName);
		System.out.println("product price is:"+productPrice);
	}
	
	
	
	
	

}
