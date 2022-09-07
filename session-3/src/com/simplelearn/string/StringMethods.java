package com.simplelearn.string;

public class StringMethods {
	public static void main(String[] args) {
		
		String s1= "Hello World";
		System.out.println("Length of string" +s1.length());
		System.out.println(""+s1.charAt(5));
		System.out.println("Upper case" +s1.toUpperCase());
		System.out.println("Concat" +s1.concat("Test"));
		System.out.println("Sub String:" +s1.substring(1));
		System.out.println("Sub String: "+s1.substring(1, 9));
		
		String s2=new String("hello world");
		System.out.println(s1.equals(s2));//case sensituve
		System.out.println(s1.equalsIgnoreCase(s2));//value comaprision
	
	}

}
