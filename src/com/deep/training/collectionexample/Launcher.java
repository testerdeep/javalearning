package com.deep.training.collectionexample;

import java.util.ArrayList;

public class Launcher {
	
	public static void main(String args[]){
		
		String [] stuName=new String[100];
		
		stuName[0]="Deep";
		stuName[1]="Ravi";
		stuName[2]="Test";
		stuName[3]="dasd";
		stuName[4]="dasdsdsd";
		
		/*for(String name: stuName){
			System.out.println(name);
		}*/
		
		
		ArrayList<String> mylist=new ArrayList<>();
		mylist.add("Deep");
		mylist.add("singh");
		mylist.add("sdfs");
		mylist.add("sdfsd");
		mylist.add("gsgg");
		
		System.out.println("mylist" + mylist.size());
		
		for(String name: mylist){
			System.out.println(name);
		}
		
	}

}
