package com.deep.training.arrayexample;

public class EqualityLauncher {
	
	public static void main(String args[]){
		
		int number1 =50;
		int number2=50;
		
		char character1='a';
		char character2='a';
		
		System.out.println(number1==number2);
		System.out.println(character1==character2);
		
		Player p1=new Player();
		Player p2=new Player();
		p1.setName("deep");
		p1.setAge(20);
		p1.setGame("football");
		p2.setName("deep");
		p2.setAge(20);
		p2.setGame("football");
		p1=p2;
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}

}
