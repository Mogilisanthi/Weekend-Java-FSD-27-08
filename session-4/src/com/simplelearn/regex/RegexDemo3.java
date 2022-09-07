package com.simplelearn.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mobile number:");
		String input=sc.next();
		Pattern pattern=Pattern.compile("[+91]+ [0-9]{10}");
		
		Matcher matcher=pattern.matcher(input);
		
		if(matcher.matches()) 
			System.out.println("pattern matched");
		else 
			System.out.println("Not matched");
		}
	}





