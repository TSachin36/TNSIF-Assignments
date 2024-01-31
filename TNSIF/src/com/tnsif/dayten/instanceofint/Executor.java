package com.tnsif.dayten.instanceofint;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = PhoneFactory.createPhone("OnePlus"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();

	}

}
