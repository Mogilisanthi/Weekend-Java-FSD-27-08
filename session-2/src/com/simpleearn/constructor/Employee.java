package com.simpleearn.constructor;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(int id,String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public void printData() {
		System.out.println("Id:" +id);
		System.out.println("Name:" +name);
		System.out.println("Email:"+email);
	}
	public static void main(String[] args) {
		Employee e1= new Employee(1,"santhi","santhi3@gmail.com");
		e1.printData();;
		
	

	}

}
