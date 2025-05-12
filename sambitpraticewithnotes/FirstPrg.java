package com.sambitpraticewithnotes;

public class FirstPrg {
//Also Need to install java lts Version;
	public static void main(String[] args) {
		System.out.println("hello World");
		/*jvm-is is responsible to run the code
		//jre-is the run time environment for executing the java code;
		//jvm makes java platform independent.platform independent means write once run any where .it possible because other  os has their own jvm with the help of this jvm makes java platform Independent.
		//Why need Programming?
		//like it is nothing but converting real world to virtual world.
		*/
		
		/*
		 =>Varible is Nothing but it is a box where we store our Data. first create a box then add values in it.
		 =>we can create a box which support same tYPE OF data.
		 =>if u dont need to store data in java a feature calle dprint we can print it but the data is not stored in the memory;
		 
		int num=3;
		here int is the datatype,num is the variable name,=is the assignment operator and 3 is the assigned value;
		print and println is means using ln we  print pur data in a new line;
		 
		 */
		
		//creating varibale:
		System.out.println(3+5);
		int num1=6;
		int num2=6;
		int result=num1+num2;
		System.out.println("Result is:"+result);
		/*DataType:
		 * there  are two types of data type;
		 * 1-primitive data type:
		 * Numeric:int,short,byte,long,double,float,Noo numeric:char,boolean;
		 * Integer:Int has is own value ;it is 4 byte means 32 bit;
		 * Long:It supports 8 byte is 64 bit;after Declaratoion l is compulsiry
		 * short:It supports 2 byte is 16bit;
		 * byte:It supports 1 byte is 8 bit; Range=2^7to 2^7-1 :-128 to 127;
		 * Float:is takes 4byte is 32 bit; after declaration f is compulasory;
		 * Double:it takes 8byte is 64 bit;In maximum case we use double
		 * char:in java char contains 2byte,16bit;for char java follow unicode not ASCII;we have to put single cors ;
		 * Boolean:In java it only accepts true or false;It suports 1bit;
		 * 
		 * 2- non primitive data type;
		 * 
		 * Literals:
		 * Interger Literal:
		 * binary,hexa,octa,deci these are all part of interger Literals;
		*/
		//datatypes:
		byte b=23;
		System.out.println(b);
		short sh=558;
		System.out.println(sh);

		long l=5768L;
		System.out.println(l);
		float f=8.9f;
		System.out.println(f);
		double d=6.6;
		System.out.println(d);
		char ch='y';
		System.out.println(ch);
		boolean br= true;
		System.out.println(br);
		//literals:
		//Integer Literal:
		//binary:
		int n=0b111;
		System.out.println(n);
		//octal
		int n2=023;
		System.out.println(n2);
		//Hexa
		int n3=0x98;
		System.out.println(n3);
		
		
		
		
		
		
		
	}

}
