package com.deep.taining.hashmapexample;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {
	
	//two object which are equal must have same hashcodde.
	//two obejects which have same hashcode my not be equal
	
	public static void main(String[] args){
		
		
		String sb1=new String("Deep");
		String sb2=new String("Deep");
		
		System.out.println(sb1.hashCode() + " : "+sb2.hashCode());
	
	
	//Map<String, String> myMap= new HashMap<>();
		Map<String, String> myMap= new ConcurrentHashMap<>();
		
	
	myMap.put("India","Delhi");
	myMap.put("China","Bejing");
	myMap.put("India", "Delhi");
	//myMap.put("India",null);
	//myMap.put(null,"Bejing");
	//myMap.put(null, null);
	
	Map<String, String> myMap1= new LinkedHashMap<>();
	
	myMap1.put("India","Delhi");
	myMap1.put("China","Bejing");
	myMap1.put("India", "Delhi");
	myMap1.put("India",null);
	myMap1.put(null,"Bejing");
	myMap1.put(null, null);
	
Map<String, String> myMap2= new TreeMap<>();
	
	myMap2.put("India","Delhi");
	myMap2.put("China","Bejing");
	myMap2.put("India", "Delhi");
	myMap2.put("India",null);
	//myMap2.put(null,"Bejing");
	//myMap2.put(null, null);
	
	System.out.println(myMap);
	System.out.println(myMap1);
	System.out.println(myMap2);
	
	Vector<String> myVector=new Vector<>();
	myVector.add("Deep");
	myVector.add("Ravi");
   myVector.add("Deep");
	myVector.add("Himanshu");
	//myVector.add(null);
	myVector.add("Aavi");
Enumeration<String> myEnum=myVector.elements();
Iterator<String> myIter=myVector.iterator();
while(myEnum.hasMoreElements()){
	System.out.println(myEnum.nextElement());
}
System.out.println("myEnum:" + myEnum);

while(myIter.hasNext()){
	String name =myIter.next();
	if (name.equals("Deep")){
	//myIter.remove();
		
	}
	
	
}

while(myIter.hasNext()){
	System.out.println(myIter.next());
	
}

Iterator<String> myMapIter= myMap.keySet().iterator();

while(myMapIter.hasNext()){
	myMap.remove("India");
	System.out.println("My Map iter :"+myMapIter.next());
	
}

System.out.println("myIter:" + myIter);
	System.out.println(myVector);
	
	
	
	
	}
	
}
