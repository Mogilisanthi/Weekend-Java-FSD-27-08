package com.simplelearn.string;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		
		String s1= new String("Hello World");
		StringBuffer buffer = new StringBuffer(s1);
		
		buffer.append("Test");
		System.out.println(buffer);
		buffer.replace(6, 11, "User");
		System.out.println(buffer);
	}

}
