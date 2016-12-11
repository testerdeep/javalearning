package com.deep.training.genericsexample;

public class GenericsExample {
	
	public static <Integer,String> void  printInput(Integer input){
		
	System.out.println(input);
	}

	
	public static void main(String args[]){
		 
		printInput(10);
		printInput("Deep");
		printInput(10.98);
	}
}