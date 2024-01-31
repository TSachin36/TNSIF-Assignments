package com.tnsif.day9.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape ;
		
		shape = new Rectangle(3.7f,4.5f);
		shape.calArea();
		shape.show();
		
		shape = new Square(2.0f);
		shape.calArea();
		shape.show();



	}

}
