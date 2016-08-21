package com.deep.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LearningRegex {
	
	public static void main(String args[]){
	
	String line ="This 123 123 order was 3456 placed This  1 2 3for QT2k23 123 OK? 3456 uiui";
	
	String pattern="(This)";
	
	Pattern r = Pattern.compile(pattern);
	Matcher m = r.matcher(line);
	int i=0;
	System.out.println(m.lookingAt());
	
	while (m.find()){
		
		System.out.println("groups:"+ m.groupCount());
	
		System.out.println("goup():" + m.group());
		System.out.println ("  starting at index " + m.start () +
                " and ending at index " + m.end ());
		System.out.println ();
		i++;
		
		
	
		//System.out.println("goup(1):" + m.group(1));
		//System.out.println("goup(2):" + m.group(2));
		//System.out.println("goup(3):" + m.group(3));
		//System.out.println("goup(4):" + m.group(4));
		//System.out.println("goup(5):" + m.group(5));
		
		
		
	}
	System.out.println("Number of time occurences:"+ i);
	
	}	
}
