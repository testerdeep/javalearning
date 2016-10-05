package com.deep.training.deadloackexample;

public class MyRunnable implements Runnable{
	
	private volatile boolean shouldRun=true;
	

	public boolean isShouldRun() {
		return shouldRun;
	}


	public void setShouldRun(boolean shouldRun) {
		this.shouldRun = shouldRun;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		System.out.println("first "+ Thread.currentThread().isInterrupted());
		System.out.println(" second"+ Thread.interrupted());
		if(Thread.currentThread().isInterrupted()){
			shouldRun = false;
			System.out.println("some one interrupted me..");
		}
		while(shouldRun){
			
			System.out.println("My Runnable is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
