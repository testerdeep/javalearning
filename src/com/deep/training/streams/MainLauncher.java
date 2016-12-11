package com.deep.training.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainLauncher {
	
	public static void main(String [] args){
		
		ArrayList<String> name= new ArrayList<>();
		
		name.add("Deep");
		name.add("Aakash");
		name.add("Raj");
		name.add("Manu");
		name.add("Abhay");
		name.add("Manu");
		
		Function<String, String> myFunction=(String names) ->{System.out.println("Current thread is:" + Thread.currentThread().getName());return names.toUpperCase();};
		Function<String ,String> myFunction2=(String input) ->{System.out.println("Current thread is:" + Thread.currentThread().getName());return input.substring(0,3);};
		Consumer<String> myConsumer=(String input) ->{System.out.println("Element: " + input);};
		System.out.println(name);
		
		name.parallelStream().
		map(myFunction).
		map(myFunction2).
		forEach(myConsumer);
		
		Collections.sort(name);
		
		name.stream()
		.map((input) ->{return input.toUpperCase();})
		.map((input) ->{return input.substring(0,3);})
		.forEach((input) ->{System.out.println(input);});
		
		name.stream()
		.map((input) ->{return input.toUpperCase();})
		.map((input) ->{return input.substring(0,3);})
		.forEach(System.out::println);
	
	long listcount=name.stream().count();
	
	System.out.println(listcount);
	

OptionalDouble myavg = IntStream.range(1, 10).average();

System.out.println(myavg.getAsDouble());
	
	
	System.out.println(IntStream.range(1,10).average());
	
	Student stu1= new Student();
	stu1.setName("Deep");
	stu1.setAge(10);
	Student stu2= new Student();
	stu2.setName("raj");
	stu2.setAge(101);
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	studentList.add(stu1);
	studentList.add(stu2);
	//winterbe.com
	IntSummaryStatistics summary= studentList.stream().collect(Collectors.summarizingInt(students -> students.getAge()));
	
	System.out.println(summary);
	
	}

}
