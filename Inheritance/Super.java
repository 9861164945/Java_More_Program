package com.Inheritance;

public class Super 
{
	private int x;
	private int y;
public void setData(int x,int y) 
{
	System.out.println("I am The Method of Super Class:");
	this.setX(x);
	this.setY(y);
	
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
public void setX(int x) 
{
	this.x=x;
}
public void setY(int y) {
	this.y=y;
}


}
