package com.deep.functionalinterfaceexample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaExpressionexample {

	//static int price=60;
	public static void main(String[] args){
		
		final int price =50;
		
		Runnable runnable=() -> {System.out.println("This is example of lamda expression.Lamda expression works only for functional interfaces");};
		runnable.run();
		
		FunctionalInterfaceExample fie =(quantity,hotel) ->{System.out.println("I am eating biriyani");
		System.out.println("no of plates" + quantity);
		System.out.println("hatelname" +hotel);
		System.out.println("Price=" + price);
	//	price=100;
		return "Biriyani";
		};
fie.getDishName(10,"Ammis Biriyani");

System.out.println(fie.getDishName(10, "Biriyani"));

Predicate<String> myPredicate=(String name) -> {
	System.out.println("Predicate example");
	if(name.length()>5){
		return true;
		
	}
	else{
		return false;
	}
	
};
	
	System.out.println("For name idia" + "\n" +myPredicate.test("India"));
	
	
	Consumer<String> myConsumer =(String name) ->{
		System.out.println("name:" + name);
	};
	
	myConsumer.accept("India");

	
	Supplier mySupplier = ()->{
		return 5;
	};
	System.out.println(mySupplier.get());
	
	Supplier sup=()-> {
		Student sobj=new Student();
		sobj.setAge("30");
		sobj.setName("Deep");
		return sobj;
	};
	
	System.out.println(sup.get());
	
	Consumer<Student> con=(Student stu)->{
		
		System.out.println(stu);
		
	};
	
	Student stu= new Student();
	stu.setAge("31");
	stu.setName("Raj");
	con.accept(stu);
	
	Function <String,Integer> myFuction =(String name) ->{
		return name.length();
	};
	
System.out.println(myFuction.apply("India"));


//non static method referencing
FoodLover foodie =new FoodLover();
FunctionalInterfaceExample fip = foodie::takeLunch;

fip.getDishName(10, "BBQ");

System.out.println(fip.getDishName(10, "BBQ"));


//static method referencing
FunctionalInterfaceExample fexp =FoodLover::takeDinner;

fexp.getDishName(20, "CopperChimney");

System.out.println(fexp.getDishName(20, "CopperChimney"));


//Constructor referencing
DishInterface dif=Dish::new;

dif.getDishName(23, "Zaika");





	}
	
	
}
