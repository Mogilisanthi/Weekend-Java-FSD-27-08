package com.simplelearn.annonymus;

public class Test1 {
	public static void main(String[] args) {
		
		Car sachinscar =new Car() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("Sachins car stopped");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("sachins car started");
				
			}
		};
		sachinscar.start();
		sachinscar.stop();
		Car ambaniscar = new Car() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("amabanis car stopped");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("amabanis car statrted");
			}
		};
		ambaniscar.start();
		ambaniscar.stop();
	}

}
