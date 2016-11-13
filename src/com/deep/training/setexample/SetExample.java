package com.deep.training.setexample;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.deep.training.comparableexample.StuComparator;
import com.deep.training.comparableexample.StuMarks;

public class SetExample {

	public static void main(String[] args){
		
		//Set<String> mySet= new HashSet<>();
		//Set<String> mySet= new LinkedHashSet<>();
		Set<String> mySet= new TreeSet<>();
		
		
		mySet.add("ZDeep");
		mySet.add("Deep");
		mySet.add("Raj");
		mySet.add("Shivam");
		mySet.add("Ravi");
		
		mySet.add("Rohit");
		//mySet.add(null);
		mySet.add("Deep");
		//mySet.add(null);
		mySet.add("Himanshu");
		
		
		System.out.println(mySet);
		//Set<StuMarks> mystudent = new TreeSet<>();
		
		Set<StuMarks> mystudent = new TreeSet<>(new StuComparator());
		StuMarks student1=new StuMarks();
		StuMarks student2=new StuMarks();
		StuMarks student3=new StuMarks();
		StuMarks student4=new StuMarks();
		
		student1.setName("Deep");
		student1.setMarks(100);
		student2.setName("shivam");
		student2.setMarks(110);
		student3.setName("raj");
		student3.setMarks(90);
		student4.setName("keep");
		student4.setMarks(1000);
		
		mystudent.add(student1);
		mystudent.add(student2);
		mystudent.add(student3);
		mystudent.add(student4);
		
		System.out.println(mystudent);
		
		
		
	}
}
