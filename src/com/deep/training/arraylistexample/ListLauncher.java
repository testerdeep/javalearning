package com.deep.training.arraylistexample;

import java.util.ArrayList;
import java.util.List;

public class ListLauncher {
	
	public static void main(String rgs[]){
		
		
		List<String> myList= new ArrayList<>();//it prserves insertion order,it excepts more than one null;allows duplicate
		
		myList.add("India");
		myList.add("China");
		myList.add("India");
		myList.add(null);
		myList.add(null);
		myList.add("Australia");
		
		System.out.println(myList);
		
		
	}

}
