package com.deep.training.callableinterfaceexample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableLauncher {

	public static void main(String args[]){
		
		ExecutorService es=Executors.newFixedThreadPool(10);
		
		for(int i=0;i<10;i++){
			MyCallable mcall=new MyCallable();
			mcall.setNumber(i);
			Future<Integer> result=es.submit(mcall);//execute we can not use in callable
			
			try {
				System.out.println("result is:" + result.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	    
		es.shutdown();
	}
}
