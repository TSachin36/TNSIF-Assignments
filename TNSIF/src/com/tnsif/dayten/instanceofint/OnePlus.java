package com.tnsif.dayten.instanceofint;

public class OnePlus implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using OnePlus");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using OnePlus");
		
	}
	
}