package com.deep.learning.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FirstRegex {

	public static void main(String args[]){
		
		String line ="This is the number is 10001 which is ggod for me for securing 100 th";
		String pattern= "is";
		int i=0;
		Pattern r= Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		
		while (m.find())
		{
			i++;
		}
		
		System.out.println(i);
	}
}
