package com.deep.calculator;

public interface Maths {

	String  maths="This is world of mathmatics";
	double sum(int sum[]);
	double substraction(double firstnum,double secondnum);
	double multiplication(double firstnum,double secondnum);
	double division(double firstnum,double secondnum);
	
	static public int sum(int num1,int num2){
		int sum;
		sum=num1+num2;
		return sum;
	}
	
	default int substraction(int num1,int num2){
		int substraction;
		substraction=num1 - num2;
		return substraction;
	}
	
	default int multiplication(int num1,int num2){
		int product;
		product=num1*num2;
		return product;
		
	}
	
	default int division(int num1,int num2){
		
		int result;
		result=num1/num2;
		return result;
	}
	
}
