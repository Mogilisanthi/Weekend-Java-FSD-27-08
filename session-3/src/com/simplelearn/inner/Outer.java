package com.simplelearn.inner;

public class Outer {
	
	private int num=4;
	class Inner{
		int innerVariable=6;
		
		void display() {
			System.out.println("Inner class diplay methos called");
			System.out.println("Display " +innerVariable);
			System.out.println("Can acces outer class variable "+num);
			
		}
		class Depth{
			void print() {
				System.out.println("Depth class print method");
				
			}
		}
		
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner= outer.new Inner();
		inner.display();
		Outer.Inner.Depth depth = inner.new Depth()	;
		depth.print();
		
	}

}
