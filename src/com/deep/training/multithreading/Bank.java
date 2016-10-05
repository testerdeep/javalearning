package com.deep.training.multithreading;

public class Bank {
	
	public static void main(String args[]){
		
		BankAccount bobj=new BankAccount();
		
		
		Deposit dobj = new Deposit();
		Withdrawl wobj=new Withdrawl();
		
		dobj.setBankaccount(bobj);
		wobj.setBankaccount(bobj);
		
		Thread t1= new Thread(wobj);
		Thread t2=new Thread(dobj);
		
		t1.start();
		t2.start();
	}

}
