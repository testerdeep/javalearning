package com.deep.training.multithreading;

public class Withdrawl implements Runnable {
	
	private BankAccount bankaccount;

	public BankAccount getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("Withdrwal thread Running");
			bankaccount.withdrawal();
		}
		
	}

}
