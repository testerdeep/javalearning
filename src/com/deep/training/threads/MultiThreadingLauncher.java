package com.deep.training.threads;

public class MultiThreadingLauncher {
	
	public static void main(String args[]){
	
	
	for (int i=0;i<100;i++)
	{
		Thread myThread=new MyThread();
		myThread.setName(i+"");
	myThread.start();
	
	
	}
	
	
	}	


}
