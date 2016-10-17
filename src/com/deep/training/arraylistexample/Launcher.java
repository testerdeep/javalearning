package com.deep.training.arraylistexample;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Launcher {

	public static void main(String args[]){
		
		Collection<String> myCollection=new ArrayList<>();
		List<String> mylist=new ArrayList<>();
		ArrayList<String> myarraylist=new ArrayList<>();
		Iterable<String> my=new ArrayList<>();
		
		myCollection.add("Mohan");
		myCollection.add("Deep");
		myCollection.add("ram");
		
		System.out.println("My collecton is:" + myCollection);
		
		Collection<Student> stu = new ArrayList<>();//every object has hashCode;Contarct between hashcode and equals;if a verified class does not override toString() method then hashcode is printed
		
		Student s1 = new Student();
		s1.setAge("10");
		s1.setName("Deep");
		s1.setAge("100");
		s1.setName("Deeps");
		
		
		
		stu.add(s1);
		
		Student s2 = new Student();
	
		
		s2.setAge("12");
		s2.setName("Ram");
		
		
		stu.add(s2);
		
		System.out.println(stu.toString());
		
		
		Collection<String> myCollec= new ArrayList<>();
		
		myCollec.add("Ram is good boy");
		myCollec.add("Ramesh");
		myCollec.add("Ramendra");
		myCollec.add("Ramindr");
		myCollec.add("Ramkrishna");
		
		Iterator<String> myIterator= myCollec.iterator();
		
		while(myIterator.hasNext()){
			String request=myIterator.next();
			if(request.equals("Ramesh")){
				myIterator.remove();
			}
			
		System.out.println("request is:" + request);	
		}
		System.out.println("Content is :" +myCollec);
		
		
		
		
		
		
		
		
	}
	
}
