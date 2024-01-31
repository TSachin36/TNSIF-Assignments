package com.tnsif.dayten.instanceofint;

public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new OnePlus();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
	}

}
