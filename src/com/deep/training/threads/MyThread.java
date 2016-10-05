package com.deep.training.threads;

public class MyThread extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("I am running " + Thread.currentThread().getName());
		}
	}

}
