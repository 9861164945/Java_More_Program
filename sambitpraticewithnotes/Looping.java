package com.sambitpraticewithnotes;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * when we need to erform any operation multiple times performing it multiple times insted of this we use loops to execute our operations multiple time
		 * while,do-while:do-while means do something while the condition executed;
		 * ,for loop, we write all the condito in btn one braces;
		 * forEach loop;
		 * in looping there is a concept is infiteloop it means code executes multiple timme continously;
		 * */
		//if i want to print  the hi multiple times we use nested loop;
		
		
	//while
int i=1;//initialization
while(i<=5) {//condition
	System.out.println("hii-"+i);//statement
	int j=1;//nested Initilization
	while(j<=3) {//nested condition
	System.out.println("Hello "+j);//nested statement;
	j++;
	}
i++;

}
System.out.println("bye-"+i);

//do-while;

int k=1;//Initialization
do {
	int l=k++;
	System.out.println(l);//statements
	l++;
}
while(k<10);//condition

//for;increment
for(int m=0;m<=4;m++) {
	System.out.println("helo-"+m);
}
//decrement
for(int n=4;n>=1;n--) {
	System.out.println("decrement"+n);
}


//write a prgo yo print day and time;
for (int p=1;p<=7;p++) {
	System.out.println(" Day :"+p);
	for(int q=1;q<=9;q++) {
		System.out.println(" "+(q+8)+"-"+(q+9));
	}
	
	//for loop p=1 checks for the condition and then execute the block then after incrementing the initialize value. 
	
	//which loop  we use
	
	/*
	 * when u know the iteration means how many times loop will be executed;
	 * read file,network and read data use while loop
	 * 
	
	*/
}

}
}


