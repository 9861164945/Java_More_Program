package com.HasARelationship;

public class Engine1
{
	private String engineType;
	private int horsePower;

	public Engine1(String engineType, int horsePower) 
	{
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() 
	{
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
}
