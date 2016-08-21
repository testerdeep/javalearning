package com.dallas.interfaces;

public class Student implements Graduate,Player {
	
	@Override
	public void takeDegree(){
		
		System.out.println("Completed B.Tech 2007");
		
	}
	
	void doStudy(){
		
		System.out.println("Now i am studying java");
	}
	
	public void sport(){
		
		System.out.println("I am football player");
		
	}
	
	@Override
	public void takeExam(){
		System.out.println("Taking exam for student");
	}

	@Override
	public void haveLunch() {
		// TODO Auto-generated method stub
		Graduate.super.haveLunch();
	}
	
	void doSleep(){
		
		System.out.println("inside student not sleeping");
	}
	

}
