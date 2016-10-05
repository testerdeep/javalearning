package com.deep.training.enumexample;

public enum Direct {
	EAST(1),
	WEST(2),
	NORTH(3),
	SOUTH(4);
	
	private int number;
	private Direct(int number){
		this.number=number;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public void setNumber(int number){
		this.number=number;
	}

}
