package com.simplelearn.practice.projects;

import java.util.Scanner;

public class EmailArrayValidation {
	
	public static void main(String[] args) {
				
		String array[]= {"mogili@gmail.com","santhi.3@gmail.com","santhimogili@gmail.com","SanthiMogili@yahoo.com","123456@yahoo.in","987456@gmail.com","Sangeetha15@gmail.com","santosh30@yahoo.com","kotagiri@gmail.com","san123456@yahoo.in"};
			
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your email ID :");
		
		String email = sc.next();
			
		if(email.equals(array[0])) {		
			System.out.println("User entered email is valid " );
		}
		else if(email.equals(array[1])) {			
			System.out.println("User entered email is valid" );
		}
        else if(email.equals(array[2])) {			
			System.out.println("User entered email is valid" );
        }
        else if(email.equals(array[3])) {
			System.out.println("User entered email is valid" );
        }
        else if(email.equals(array[4])) {	
	        System.out.println("User entered email is valid" );
        }
        else if(email.equals(array[5])) {	
	        System.out.println("User entered email is valid" );
        }
        else if(email.equals(array[6])) {	
	        System.out.println("User entered email is valid" );
        }
        else if(email.equals(array[7])) {	
	        System.out.println("User entered email is valid" );
        }
        else if(email.equals(array[8])) {	
	        System.out.println("User entered email is valid" );
        }
        else if(email.equals(array[9])) {	
	        System.out.println("User entered email is valid" );
        }	
		else {
		    System.out.println("User entered email is Invalid" );
		}sc.close();
		
	}
	}

		
		
					



		
		
					





