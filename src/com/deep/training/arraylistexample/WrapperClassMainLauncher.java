package com.deep.training.arraylistexample;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassMainLauncher {

	public static void main(String rgs[]){
		
		List<Integer> myList= new ArrayList();
		
		int marks=50;
		
		myList.add(marks);//This is called auto boxing
		
		System.out.println(myList);
		
		int result= myList.get(0);//This is called unboxing
		System.out.println(result);
		
	}
	
}
