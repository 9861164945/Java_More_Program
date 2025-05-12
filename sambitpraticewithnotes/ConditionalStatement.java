package com.sambitpraticewithnotes;

public class ConditionalStatement {

	public static void main(String[] args) {
		//Conditional Statement
		/*
		 * when we execute the code code goes top down approach;
		 *we add some condtion to imporove our code reusability;
		 *if u have one statement inside in the situation u dont need the{ curli braces};but in more then one statement compulsory to write the statement within {curli braces} ;
		 *if{} else{}
		 *if{} else if{} else{}
		 */
		
		int x=10;
		if(x>10) {
		System.out.println("Hello");
		}
		else if(x==10){
			System.out.println("Kn chalichi");
			
		}
		else {
		System.out.println("Bye");
		}
		int y=10;
		if(false) {
			System.out.println("Hello everyOne");
		}
		else {
			System.out.println("kn ba");
		}
		
		if(y>10 && y<=20) {
			System.out.println("Multiple condition");
		}
		else if(y>10 || y<=20) {
			System.out.println("Or Operation");
			
		}
		
		//Code for the greatest among three;
		int e =9;int f=11;
				int g=81;
				if(e>f&&e>g) {
					System.out.println("Gretest is e:"+e);
				}
				else if(f>e &&f>g) {
					System.out.println("gretest  is f:"+f);
				}
				else {
					System.out.println("gretest is y:"+g);
				}
		
		
				//check even odd; when the value is evne result as 10and if odd result is 20;
				int nno=5;
				int result =0;
				if(nno%2==0) {
					result+=10;
			
				}
				else {
					result+=20;
				}
				System.out.println(result);
				//Ternaray Operator;
				
				/* at this type of condition we have another ption is named as Ternary Operator;
				 * (nno%2==0)?10:20;
				 * if the condition is true u have to execute 10 and if false u have to execute 20;
				 * */
				
				//SwitchCase
				/*
				 * Switch case we need for when we need one or morethan condition based .like where we neee more if else statement instead of using the if else repeatedly better have to use the switch case*/
				int day=9;
				switch(day) {
				case 1:System.out.println("monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
				System.out.println("Wedensday");
				break;
				case 4:
				System.out.println("Thursday");
				break;
				case 5:
				System.out.println("friday");
				break;
				case 6:
				System.out.println("Saturday");
				break;
				case 7:
				System.out.println("Sunday");
				break;
				default:
					System.out.println("invalid input");
					
				}
				
				
		
	}

}
