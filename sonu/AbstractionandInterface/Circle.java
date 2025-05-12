package com.sonu.AbstractionandInterface;

public class Circle extends Shape
{
	private double radiusInCm;
	
	public Circle(double radiusInCm) {
		this.radiusInCm=radiusInCm;
	}

	public double getRadiusInCm() {
		return radiusInCm;
	}

	public void setRadiusInCm(double radiusInCm) {
		this.radiusInCm = radiusInCm;
	}
	
	@Override
	public double calculateArea()
	{
		 return Math.PI*Math.pow(radiusInCm, 2);
		
	}

}
