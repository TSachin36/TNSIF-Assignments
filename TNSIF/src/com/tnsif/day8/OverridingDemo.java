package com.tnsif.day8;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi  rbi;
		rbi = new Sbi();
		
		System.out.println(rbi.getRateOfInterst());
		rbi = new Hdfc();
		System.out.println(rbi.getRateOfInterst());
		
		rbi = new Icici();
		System.out.println(rbi.getRateOfInterst());

	}

}
