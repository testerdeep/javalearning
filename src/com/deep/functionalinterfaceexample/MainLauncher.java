package com.deep.functionalinterfaceexample;

public class MainLauncher {

	
	public static void main(String[] args){
		
		Runnable runable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is inner class content");
			}
		};
		
		runable.run();
		
	}
}
