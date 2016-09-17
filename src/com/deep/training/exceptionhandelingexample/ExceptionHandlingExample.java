package com.deep.training.exceptionhandelingexample;

public class ExceptionHandlingExample {
	
	void read() throws NoMoodToStudyException,NoBookAvailableException{
		System.out.println("Read book");
		
		try {
			getBook();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
		throw new NoMoodToStudyException("This is my own exception");
		}catch(Exception e){
			e.printStackTrace();
		}
		throw new NoBookAvailableException("No Book available");
		
	}

	void getBook() throws Exception{
		System.out.println("Getbook");
		try {
			int [] myBook = new int[10];
			myBook[10]=45;
			
			System.out.println("I have read books");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new Exception("Long queue");
		
	}
}
