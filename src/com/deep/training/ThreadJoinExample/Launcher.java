package com.deep.training.ThreadJoinExample;

public class Launcher {
	
	public static void main(String args[]){
		
		Thread tobj=new Thread(new ThreadJoinRunnable());
		tobj.start();
		
		try {
			tobj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("My Thread resumed");
	}

}
