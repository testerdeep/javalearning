package com.deep.training.enumexample;

public class EnumLauncher {

	public static void main(String args[]){
		
		Path pathObj = new Path();
		pathObj.showPath(Direction.EAST);
	Direct myDirect=Direct.EAST;
	System.out.println(myDirect.getNumber());
	System.out.println(myDirect.ordinal());
	System.out.println(Direct.EAST.ordinal());
	System.out.println(Direct.WEST.ordinal());
	System.out.println(Direct.NORTH.ordinal());
	System.out.println(Direct.SOUTH.ordinal());
	
	
		
	}
}
