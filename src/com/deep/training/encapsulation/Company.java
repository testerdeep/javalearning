package com.deep.training.encapsulation;

public class Company {
	
	public static void main(String args[]){
		
		Manager manager=new Manager("deep",11,"manager");
		ProductManager pm=new ProductManager("deep",21,"manager");
		pm.takeInterview();
		
		
	}

}
