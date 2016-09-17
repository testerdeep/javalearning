package com.deep.training.stringexample;

import java.sql.Time;
import java.util.StringTokenizer;

public class StringConcateExample {

	static void printresult(String name) {

		System.out.println("Printing");
	}

	public static void main(String args[]) {

		String fname = "Deep";
		String lname = "Verma";
		int age = 27;

		String result = fname + lname;
		System.out.println(result);

		System.out.println("result is:" + (fname + age));

		printresult(100 + "");
		
		String marks="50";
		
		
		
		System.out.println(marks+age);
		System.out.println(Integer.parseInt(marks)+age);
		
		String bigString="In.dia. is my. coun.try";
		
		System.out.println(bigString.substring(0,5));
		System.out.println(bigString.substring(4));
		
		String sobj= new String("India");
		String sobjstr=sobj.intern();
		
		String country="India";
		
		System.out.println("result:" + (sobjstr==country));
		
		String s1="India";
		String s2="is";
		String s3="my";
		String s4="country";
		String mycountry;
		mycountry=s1+s2+s3+s4;
		
		System.out.println("Result is:" + mycountry);
		
		System.out.println("updated result:" + s1.concat(s2).concat(s3).concat(s4)); //concat and + are same//
		
		
		StringBuilder myBuilder=new StringBuilder();
		StringBuffer myBuffer=new StringBuffer();
        
		System.out.println(System.currentTimeMillis());
		
		System.out.println("BuilderResult is :" + myBuilder.append(s1).append(s2).append(s3).append(s4));
		System.out.println(System.currentTimeMillis());
		
		System.out.println("Buffer result:" + myBuffer.append(s1).append(s2).append(s3).append(s4));
		System.out.println(System.currentTimeMillis());
		
		StringTokenizer mytoken=new StringTokenizer(bigString,".");
		while(mytoken.hasMoreTokens())
		{
		System.out.println(mytoken.nextToken());
		}
		
	
	}
	

}
