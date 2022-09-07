package com.simplelearn.inner;

public class LocalInnerClass {
	public void display() {
		
		class Inner{
			int num=4;
			void print() {
				System.out.println("Print method called from innerclass");
				System.out.println("value" +num);
			}
		}
		Inner inner =new Inner();
		inner.print();
		
	}
	public static void main(String[] args) {
		LocalInnerClass l= new LocalInnerClass();
		l.display();
	}

}
