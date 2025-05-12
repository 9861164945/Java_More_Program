package com.HasARelationship;

public class Engine
{
	private String model;

	public Engine(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	
	public void setModel(String model) 
	{
		if(model.isEmpty()||model==null) 
		{
			System.out.println("Error!");
			System.exit(0);
			
		}
		else 
		{
			this.model = model;
		}
		
	}

	@Override
	public String toString() 
	{
		return " [model=" + model + "]";
	}
	

}
