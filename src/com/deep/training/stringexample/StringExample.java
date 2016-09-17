package com.deep.training.stringexample;

public class StringExample {

	public static void main(String args[]){
		String name1= "Deep";  //String literal goes to string pool
		String name2="Deep";
		String name3=new String("Ravi");
		String name4=new String("Ravi");  //String objectgoes to heap
		
		/*System.out.println(name1);
		System.out.println(name2);*/
		
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		System.out.println(name3==name4);
		System.out.println(name3.equals(name4));
		
		
		
		
	}
}
