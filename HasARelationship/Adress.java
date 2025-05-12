package com.HasARelationship;

public class Adress 
{
	private String street;
	private String city; 
		
public Adress(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

public String getStreet() {
	return street;
}

public String getCity() {
	return city;
}

public void setStreet(String street)
{
	if(street.isEmpty()) 
	{
		System.err.println("StreetName Can not be Empty!");
		System.exit(0);
	}
	else 
	{
		this.street = street;
		
	}
	
}

public void setCity(String city)
{
	if(city.isEmpty()) 
	{
		System.err.println("City can not be Empty!");
		System.exit(0);
	}
	else 
	{
		this.city = city;
	}
	
}

@Override
public String toString() {
	return "Adress [street=" + street + ", city=" + city + "]";
}



}
