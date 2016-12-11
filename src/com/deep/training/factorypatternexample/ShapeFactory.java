package com.deep.training.factorypatternexample;

public class ShapeFactory {
	
	public Shape getShape(String input){
		if(input.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else if (input.equalsIgnoreCase("Square")){
			
			return new Square();
		}
		
		else if (input.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		
		return null;
	}

}
