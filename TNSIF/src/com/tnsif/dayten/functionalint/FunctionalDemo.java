package com.tnsif.dayten.functionalint;

public class FunctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GreetClass obj = new GreetClass(); System.out.println(obj.greet());
		 */
		
		
		//using Lambda Expression
				GreetInterface g1 = () -> {
					return "welcome to java";
					
				};
				System.out.println(g1.greet());


	}

}
