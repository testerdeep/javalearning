package com.deep.training.multithreading;

public class BankAccount {
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	private int balance=2;
	
	void deposit(){
		
		synchronized (this){

			if(balance == 5){
				
				System.out.println("can not deposit");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				balance=balance+1;
				notify();
			}
		}
		
		System.out.println("Balnace" +balance);
	}
	
	void withdrawal(){
		synchronized(this){
			
			if(balance==0){
				System.out.println("Can not withdrawl");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			else{
			balance=balance-1;
			notify();
			}
		}
		
		System.out.println("Balance" + balance);
	}
	
	

}
