package com.deep.training.comparableexample;

public class StuMarks implements Comparable<StuMarks>{
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	String name;
	int marks;

	@Override
	public int compareTo(StuMarks otherStudent) {
		// TODO Auto-generated method stub
		if(this.marks >otherStudent.getMarks()){
			return 1;
		}
		else if (this.marks < otherStudent.getMarks()){
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	public String toString(){
		
		return "name:" +this.name + "marks:" + this.marks;
		
	}

}
