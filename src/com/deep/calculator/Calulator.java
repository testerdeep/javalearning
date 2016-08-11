package com.deep.calculator;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Calulator {
	
	public static void main(String args[]){
		
		String option=null;
		System.out.println("Welcome to the Calculation world!!!!!");
		System.out.println("Please select the operation you want to perform");
		System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Max \n6.Min \n7.Average");
	    System.out.println("Please select your option:");
	    Scanner cin= new Scanner(System.in);
	    try{
	     option =cin.next();
	    System.out.println(option);
	    }catch(Exception e){
	    	
	    }
	    Sum add =new Sum();
	    switch(option){
	    case "1": 
	    {
	    	System.out.println("Addition of numbers");
	    	System.out.println("Please enter first number");
	    }
	    
	    	
	    }
	    
	}
 
}
