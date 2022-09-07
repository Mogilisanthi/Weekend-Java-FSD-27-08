package com.simplelearn.abstraction;

public abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}
	abstract double area();
	

}
