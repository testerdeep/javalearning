package com.deep.training.arrayexample;

public class Sports {

	public static void main(String args[]){
		
		Player [] players=new Player[3];
		
		Player p1 = new Player();
		
		players[0]= p1;
		players[1]=new Player();
		players[2]=new Player();
		
		p1.setName("deep");
		p1.setAge(16);
		p1.setGame("Cricket");
		players[1].setName("Raj");
		players[1].setAge(18);
		players[1].setGame("Football");
		players[2].setName("Amit");
		players[2].setAge(19);
		players[2].setGame("Badminton");
		
		


ArrayExample ax=new ArrayExample();

for (int arrayindex=0;arrayindex<ax.myarray.length;arrayindex++){
System.out.println("element at location" + arrayindex + "is :" + ax.myarray[arrayindex]);
}

for (int arrayelement :ax.myarray)
{
	System.out.println("Element is " + arrayelement);
	}


for (Player playerelement : players){
	
	System.out.println("Players name:" + playerelement.getName() +" Player Age:" + playerelement.getAge() + " Player sport:" +playerelement.getGame());
}
/*
for (Player playerindex=0;playerindex<players.length;playerindex++){
	
}*/

for (int playerindex=0; playerindex<players.length;playerindex++)
{
	Player tempplayer=players[playerindex];
	}
	 }
}
