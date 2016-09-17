package com.deep.calculator;

public class Mathsmethod implements Maths{
	
@Override	
public double sum(int num[]){
		
		int sum=0;
		
		return sum;
	}
@Override
public double substraction(double firstnum,double secondnum ){
	double substraction= firstnum - secondnum;
	return substraction;
	}
@Override
public double multiplication(double firstnum,double secondnum){
	double product;
	product=firstnum*secondnum;
	return product;
}

@Override
public double division(double firstnum,double secondnum){
	double result;
	result=firstnum/secondnum;
	return result;
}

}
