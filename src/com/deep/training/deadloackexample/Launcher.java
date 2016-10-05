package com.deep.training.deadloackexample;

public class Launcher {

	public static void main(String args[]){
		/*FirstThread fobj=new FirstThread();
		SecondThread sobj=new SecondThread();
		
		Thread t1=new Thread(fobj);
		Thread t2=new Thread(sobj);
		
		t1.start();
		t2.start();*/
	
	 MyRunnable mrun=new MyRunnable();
	 
	 Thread t1=new Thread(mrun);
	 
	 t1.start();
	 
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 t1.interrupt();
	 //mrun.setShouldRun(false);
	
	}
}
