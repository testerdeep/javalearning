package com.deep.training.exceptionhandelingexample;

public class NoMoodToStudyException extends Exception {
	
	private String msg;
	
	NoMoodToStudyException(String msg){
		super(msg);
		this.msg=msg;
		}
	
	
	
	public String toString(){
		return this.msg;
		
	}

}
