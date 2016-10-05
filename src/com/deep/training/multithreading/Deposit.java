package com.deep.training.multithreading;

public class Deposit implements Runnable {
	
	private BankAccount bankaccount;
	

	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stu
		while(true){
			System.out.println("Deposit thread running");
			bankaccount.deposit();
		}
		
	}

}
