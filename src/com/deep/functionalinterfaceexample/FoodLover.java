package com.deep.functionalinterfaceexample;

public class FoodLover {
	
	String takeLunch(int quantity,String hotel){
		
		System.out.println("quantity:" + quantity +"hotel:" + hotel);
	
		return "BBQ";
	}
	
	static String takeDinner(int quantity,String hotel){
		
		System.out.println("quantity:" + quantity +"hotel:" + hotel);
	
		return "BBQ";
	} 

}
