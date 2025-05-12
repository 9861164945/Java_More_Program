package com.sambitpraticewithnotes;

public class AssignmentOperator {

	public static void main(String[] args) {
		//Operator;
		/*
		 * when we perform a operation we need Operator;
		 *
		 * like n=1;
		 * n2-5;
		 * addition:a+b
		 a and b are operands and + is the assignment operator
		 * */
		//code
		int num1=76;int num2=90;
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		
		int mod=num1%num2;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);

		/*
		 *  dor pwerfoming operation with niw we use += operator*/
		int t=12;
		t += 12;
		System.out.println(t);
		
		//Incremment and decrement;

		/*
		 * It has two types post and pre :post means after name and pre means before in post first we assign the value then increment but in pre viceversa;
		 * Both Are same aim to increment an decrement the value but  some chnages are there .
		 * ++tandt++ are not same.
		 * t++-first fetch the value and then increment.
		 * ++t-first increment then it fetch the value.
		 * same for decrement.
		 * 
		 *  */
		t++;
	
		System.out.println(t);
		++t;
		System.out.println(t);
		

		/*
		 * here we  talke an example 
		 * t=24;
		 * l=t++ + ++t
		 * t++*/
		int u=24;
		 int l=++u +u++;
		 int v=24;
		 int m=v++ + ++v;
		 System.out.println(l);
		 System.out.println(m);
		 //Relational Operator;
		 /*
		  * <,>,<=,>=,==,!=
		  * these are relational Operator;
		  * in java we use == to check equality
		  *The return type is either true or False;
		  */
		 int x=5;
		 int y=5;
		 boolean res=x>=y;
		 boolean res1=x<=y;
		 System.out.println(res);
		 System.out.println(res1);
		 System.out.println(x!=y);
		 System.out.println(x==y);
		 //Logical Operator;
		 /*
		  *we need  when we check two condition in a single condition;
		  *Logical And&&:If both condition is true then the output is true,if one of them is  false result is false;
		 if first one is false it doesnt check the second condition;
		 Logical  Or:||:If any of one condition is true the output is true.
		 if 1st is true it is  not checking the second condtiion; 
		 Logical Not!:If u have true output you want false and you false output you want true then you need Not operator.
		 */
		 
		 int a=7;
		 int b=5;
		 int c=5;
		 int d=9;
		 boolean e=a>b&&c>d;
		 System.out.println(e);
		 System.out.println(a<b&&c<d);
		 System.out.println(a<b||c<d||a<1);
		 System.out.println(a>b);
		 
		 
		 
	
	}

}
