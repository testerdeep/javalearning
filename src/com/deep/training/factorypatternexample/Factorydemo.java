package com.deep.training.factorypatternexample;

public class Factorydemo {
	
	public static void main(String args[]){
		
		ShapeFactory sf = new ShapeFactory();
		
		Shape circle=sf.getShape("Circle");
		circle.draw();
		
		Shape square=sf.getShape("Square");
		square.draw();
		
		Shape rectangle=sf.getShape("Rectangle");
		rectangle.draw();
	}

}
