package com.deep.training.interuptedexample;

public class MyRunningRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(false==Thread.currentThread().isInterrupted()){
			
			System.out.println("My running thread is running");
		}
		
	}

}
