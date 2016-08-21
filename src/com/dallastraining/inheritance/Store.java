package com.dallastraining.inheritance;

import com.training.constructor.*;
public class Store {
	
	public static void main(String args[]){
		
	Mobiles mobile =new Mobiles();
	BasicPhone basicphone=new BasicPhone();
	SmartPhone smartphone = new SmartPhone();
	AndroidPhone androidphone= new AndroidPhone();
	IosPhone iosphone= new IosPhone();
	PhoneFeature phonefeature = new PhoneFeature();
	
	Mobiles basicmobile = new BasicPhone();
	Mobiles smartmobiles= new SmartPhone();
	Mobiles basicandroid= new AndroidPhone();
	Mobiles basicios = new IosPhone();
	
	//MarutiCar maruti =new MarutiCar();
	
	Vehicle vehicle=new Vehicle();
	//Car car=new Car();
	//System.out.println(smartphone.number);
	
	SmartPhone android = new AndroidPhone();
	SmartPhone ios = new IosPhone();
	
	System.out.println("*********************************************************************");
	phonefeature.feature(mobile);
	System.out.println("*********************************************************************");
	phonefeature.feature(basicphone);
	System.out.println("*********************************************************************");
	phonefeature.feature(smartphone);
	System.out.println("*********************************************************************");
	phonefeature.feature(androidphone);
	System.out.println("*********************************************************************");
	phonefeature.feature(iosphone);
	System.out.println("*********************************************************************");
	phonefeature.feature(basicmobile);
	System.out.println("*********************************************************************");
	phonefeature.feature(smartmobiles);
	System.out.println("*********************************************************************");
	phonefeature.feature(basicandroid);
	System.out.println("*********************************************************************");
	phonefeature.feature(basicios);
	System.out.println("*********************************************************************");
	phonefeature.feature(android);
	System.out.println("*********************************************************************");
	phonefeature.feature(ios);
	System.out.println("*********************************************************************");
	
	 }
	}