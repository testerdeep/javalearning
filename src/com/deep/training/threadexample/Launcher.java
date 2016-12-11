package com.deep.training.threadexample;

public class Launcher {
	
	public static void main(String arg[]){
		
		Thread t1= new Name();
		Thread t2= new Age();
		
		t1.run();
		try {
			t1.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.run();
		
		try {
			t2.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
