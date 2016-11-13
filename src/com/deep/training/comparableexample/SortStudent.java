package com.deep.training.comparableexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {
	
	
	
	public static void main(String[] args){
		
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
		
		
	
	List<StuMarks> myStudentList=new ArrayList<>();
	
	myStudentList.add(student1);
	myStudentList.add(student2);
	myStudentList.add(student3);
	myStudentList.add(student4);
	
	System.out.println("before sorting"+ myStudentList);
	
	//Collections.sort(myStudentList);
	Collections.sort(myStudentList,new StuComparator());
	
	
	System.out.println("after sorting"+myStudentList);
	}
	
	
	
	
	
	

}
