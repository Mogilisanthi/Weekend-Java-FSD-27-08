package com.simplelearn.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmailArrayValidation {
	public static void main(String[] args) {
				
		List<String> list = new ArrayList<>();
		
		String array[]= {"mogili@gmail.com","santhi.3@gmail.com"};
		Collections.addAll(list, array);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your email ID :");
		
		String input = sc.next();
		Iterator<String> it = list.iterator();
		
		
		if (it.equals(array[0]))
				 {
			System.out.println("Email is valid");
			
		}
		else {
			System.out.println("Email is not valid");
		}
		
		
	}

}
