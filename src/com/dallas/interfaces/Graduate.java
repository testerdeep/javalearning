package com.dallas.interfaces;

public interface Graduate {

	void takeDegree();
	String university="vtu";
	
	default void takeExam(){
		System.out.println("First year exam");
	}
	
	default void haveLunch(){
		System.out.println("Lunch at 2");
	};

String city="Bngalore";
static void doSleep(){
	
	System.out.println("Graduate is sleeping");
}

}
