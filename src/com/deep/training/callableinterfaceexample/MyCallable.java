package com.deep.training.callableinterfaceexample;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		return number*number;
	}

	
	

}
