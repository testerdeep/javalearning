package com.deep.training.deadloackexample;

public class SecondThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(SyncTwo.class){
			
			synchronized(SyncFirst.class){
				System.out.println("2nd Tread ");
				
			}
		}
		
	}

}
