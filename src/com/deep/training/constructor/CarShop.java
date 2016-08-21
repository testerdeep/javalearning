package com.deep.training.constructor;

public class CarShop {
public static void main(String args[]){
	
	MarutiCar alto=new MarutiCar();
	Vehicle vehicle=new Vehicle();
	System.out.println(vehicle.number);
	Car car=new Car();
	System.out.println(car.number);
	
	
	vehicle.printNumber();
	
}
}
