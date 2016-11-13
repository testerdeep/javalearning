package com.deep.training.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainLauncher {
	
	public static void main(String [] args){
		
		ArrayList<String> name= new ArrayList<>();
		
		name.add("Deep");
		name.add("Aakash");
		name.add("Raj");
		name.add("Manu");
		name.add("Abhay");
		name.add("Manu");
		
		Function<String, String> myFunction=(String names) ->{return names.toUpperCase();};
		Function<String ,String> myFunction2=(String input) ->{return input.substring(0,3);};
		Consumer<String> myConsumer=(String input) ->{System.out.println("Element: " + input);};
		System.out.println(name);
		
		name.stream().
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
	}

}
