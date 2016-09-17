package com.deep.training.encapsulation;

public class Manager {
private String name;
private int age;
private String designation;

Manager(String name,int age,String designation){
	System.out.println("This is default constructor");
}

void takeInterview(){
	System.out.println("Manage will take interview");
}
void readResume(){
	System.out.println("Manager is reading resume");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
}
