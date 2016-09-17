package com.deep.training.encapsulation;

public class ProductManager extends Manager{
	
	private String name;
	private int age;
	private String Designation;
	
	ProductManager(String name,int age,String designation){
		super(name, age, designation);
		System.out.println("This is default constructor for productmanager");
	}
	@Override
	void takeInterview(){
		System.out.println("PM will take interview");
		super.takeInterview();
		this.readResume();
		super.readResume();
	}
	
	@Override
	void readResume(){
		System.out.println("Pm is reading resume");
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
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}

}
