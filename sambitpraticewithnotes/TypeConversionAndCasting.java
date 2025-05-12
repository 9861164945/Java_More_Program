package com.sambitpraticewithnotes;

public class TypeConversionAndCasting {

	public static void main(String[] args) {
		//Type Conversion and casting:
		
		/*
		 *we cant change the typeof the variable but we can assign;
		 *byte b=127;
		 *int a=256;
		 *when we assign the byte to int that time the real challange comes;
		 *b=a;not compile error;but a=b compile beacuse integer has maximum range than the byte;
		 * 
		 * we cant store boolean and char;
		 * 
		 */
		
		byte b=12;
		int n=b;
	//but here code compiles perfectly;bcz int has large range than byte;	
		//b=n;//here comes possible loosy convertion
	System.out.println(n);	
	byte b1=127;
	byte k=(byte)n;//here we find the error incompatibale type brfore type casting';
    
	System.out.println(b1);
	
	//float
	float f1=8.9f;
	int t=(int)f1;
	
	System.out.println(t);
	
	//typepromotion;
	/*
	 * when we perform any operation on two byte value if the range with 127 then we assign our values in byte format other wise we have toi save it in integer format
	 * 
	 * */
	byte p=67;
	byte q=109;
	int r=p+q;//it works perfectly;
	//byte r=p+q; // it does not store the values because it is out of the range;
	short s=32766;
	char c='a';
	int c1=c;
	System.out.println(c1);
	System.out.println(s);//incompatable type possible loosy convertion
	System.out.println(r);
	
	
	
	
	
	}

}
