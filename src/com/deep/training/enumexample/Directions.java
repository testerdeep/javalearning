package com.deep.training.enumexample;

public enum Directions {
	
NORTH(0),
SOUTH(1),
EAST(2),
WEST(3);

private int number;
	
public int getNumber(){
	return this.number;
	
	
}
public void setNumber(int number){
	this.number = number;
	
}
   	

private Directions(int number){
	this.number = number;
}
 	

}
