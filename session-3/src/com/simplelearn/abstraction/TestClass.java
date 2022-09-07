package com.simplelearn.abstraction;

public class TestClass {
	public static void main(String[] args) {
		
		Shape s1=new Circle("blue",3.4);
		Shape s2=new Rectangle("red",6,2.3);
		
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
