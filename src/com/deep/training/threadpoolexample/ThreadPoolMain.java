package com.deep.training.threadpoolexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
	
	public static void main(String args[]){
		
		
		ExecutorService es = Executors.newCachedThreadPool();//newFixedThreadPool
		for(int i = 0; i < 100; i++)
		{
			
			System.out.println(i);
			es.execute(new MyRunnable());//submit and execute we can use for runnable
		}
		
		es.shutdown();
	}
	
	
	

}
