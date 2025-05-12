package com.AssignmentJavaNit;

public class Movie {
private  String title;
private int releaseYear;
private String genre;
public Movie(String title, int releaseYear, String genre) {
	super();
	this.title = title;
	this.releaseYear = releaseYear;
	this.genre = genre;
}

//Getter
public String getTitle() 
{
	return title;
}
public int getReleaseYear() 
{
	return  releaseYear;
}
public String getGenre() 
{
	return genre;
	
}


//Setter
public String setTitle(String title) 
{
	 return this.title=title;
	
}
public int setReleaseYear(int releaseYear) 
{
	return this.releaseYear=releaseYear;
}

public String setGenre(String genre) {
	return this.genre=genre;
}




@Override
public String toString() {
	return "Movie [title=" + title + ", releaseYear=" + releaseYear + ", genre=" + genre + "]";
}

	
	
	
	
	
}
