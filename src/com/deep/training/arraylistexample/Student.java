package com.deep.training.arraylistexample;

public class Student {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	private String age;
	
	@Override
	public String toString(){
		
	return ("name:"+ this.name + " age:" +this.age);
	}
	
}
