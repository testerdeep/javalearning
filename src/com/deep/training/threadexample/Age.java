package com.deep.training.threadexample;

public class Age extends Thread {
	
	@Override
	public void run(){
		while(true)
		System.out.println("Age");
	}
	

}
