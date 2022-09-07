package com.simplelearn.string;

public class StringDemo {
	public static void main(String[] args) {
		
		String s1="Hello World";
		String s2= "Hello World";
		
		String s3=new String("Hello Worls");
		String s4=new String("Hellow World");
		
		if (s3==s4) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
				
	}

}
