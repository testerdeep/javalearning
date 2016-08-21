package com.deep.learning.dallas.interfaces;

public interface Player {
	
	void sport();
	void takeDegree();
	default void takeExam(String sport){
		System.out.println("Sport exam");
	}
	
	default void haveLunch(){
		
	};
	
	static void doTraining(){
		System.out.println("do training for php");
	}
	
	String city="Bngalore";
	static void doSleep(){
		
		System.out.println("Player is sleeping");
	}
	
}
