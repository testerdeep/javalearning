package com.deep.training.ds;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String args[]){
		
		LinkedList myList = new LinkedList<>();
		
		myList.add("Deep");
		myList.add("Raj");
		
		System.out.println(myList);
		
		myList.addFirst("First Item");
		myList.addLast("Last Element");
		
		System.out.println(myList);
		
		ArrayList<String> myalist=new ArrayList<>();
		myalist.add("ujjwal");
		myalist.add("jyoti");
		myList.add(myalist);
		
		System.out.println(myList);
		
		
		}

}
