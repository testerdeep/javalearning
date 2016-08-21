package com.dallas.interfaces;

public class Result {
	public static void main(String args[]) {
		
		Student sobj=new Student();
		sobj.takeDegree();
		
		Graduate grad= new Student();
		grad.takeDegree();
	sobj.doStudy();
	//grad.do
	
	Player player=new Student();
	player.sport();
	player.takeDegree();
	
	System.out.println(sobj.university);
	sobj.takeExam();
	sobj.takeExam("football");
	grad.takeExam();
	player.takeExam("cricket");
	
	Player.doTraining();
    
	sobj.doSleep();
	Graduate.doSleep();

	
		

	}
}
