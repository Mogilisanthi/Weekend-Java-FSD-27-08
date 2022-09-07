package com.simplelearn.polymorphism;

public class MethodOverload {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
		
	}
	public float add(float a,float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
	MethodOverload m= new MethodOverload();
	System.out.println("int addition" +m.add(3 ,4));

}
}
