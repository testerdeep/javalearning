package com.deep.training.threadpoolexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
	
	public static void main(String args[]){
		
		
		ExecutorService es = Executors.newFixedThreadPool(10);
		for(int i = 0; i < 10; i++)
		{
			
			
			es.submit(new MyRunnable());
		}
		
		es.shutdown();
	}

}
