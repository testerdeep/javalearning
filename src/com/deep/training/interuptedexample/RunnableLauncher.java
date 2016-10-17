package com.deep.training.interuptedexample;

public class RunnableLauncher {
	
	public static void main(String args[]){
		
		MyRunnable mr=new MyRunnable();
		MyRunningRunnable mrr=new MyRunningRunnable();
		Thread t1=new Thread(mr);
		t1.start();
		
		Thread t2=new Thread(mrr);
		t2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.interrupt();
		t2.interrupt();
		
	}

}
