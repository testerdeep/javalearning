package com.deep.training.threadpoolexample;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is my runnable "+Thread.currentThread().getName());
	}

}
