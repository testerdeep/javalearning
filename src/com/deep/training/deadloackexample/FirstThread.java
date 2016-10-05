package com.deep.training.deadloackexample;

public class FirstThread implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(SyncFirst.class){
			
			synchronized(SyncTwo.class){
				System.out.println("First Tread ");
				
			}
		}
		
	}

}
