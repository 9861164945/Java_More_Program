package com.sambitpraticewithnotes.oops;


public class Book {
	
static int totalNoOfBooks=9;
String title;
String author;
String isbnId;
boolean isBorrowed;


static {
	totalNoOfBooks=0;
}
//object init
{
	totalNoOfBooks++;
}

public Book(String title,String author,String isbnId)
{
	this.isbnId=isbnId;
	this.title=title;
	this.author=author;
	
}
 public Book(String isbnId){
	this(isbnId,"Unknown","Unknown");
}

public static int getTotalBook() {
	return totalNoOfBooks;
}

	public void borrowBOOK() {
		if(isBorrowed) {
	System.out.println("Book is  already  Borrowed");		
		}
		else {
			this.isBorrowed=false;
			System.err.println("Enjoy the book "+this.title);
}
}

	 public void returnBook() 
	{
		if(isBorrowed) {
			this.isBorrowed=true;
			System.out.println("How you Have Enjoyed ,Please Leave a review");
		}
		else {
			System.out.println("This book is already in the Library");
		}
	
		
	}

	@Override
	public String toString() 
	{
	 return "Book [title=" + title + ", author=" + author + ", isbnId=" + isbnId +",IsBorrowed:"+isBorrowed+ "]";
	}
	
	public static void main(String[] args) 
	{
       Book b1=new Book("coreJava","James goshling","h101");
		b1.borrowBOOK();
		b1.returnBook();
		Book.getTotalBook();
		System.out.println(b1);
	 }

}
