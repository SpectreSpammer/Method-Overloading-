package com.wipro.technical.exam.overloading;

public class Calculator {

	
	
		//overloading
		public void  sum(int a , int b) {
			
			int total = a+b;
			System.out.println(total);
		}
		
		
		public void sum(double a , double b) {
			
			double total = a+b;
			System.out.println(total);
			
			
		}

		
}
