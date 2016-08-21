package com.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondRegex {
	
	public static void main(String args[]){
		String input ="This is for counting is in this string which is complicated";
		String pattern= "is";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		
	}

}
