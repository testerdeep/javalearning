package com.deep.learning.overriding;

import com.deep.training.exceptionhandelingexample.NoMoodToStudyException;

public class Geography {
	
	public static void main(String args[]){
		
		Country country=new Country();
		World world=new World();
		
		World newcountry=new Country();
		try {
			country.countryname(country);
			world.countryname(country);
			newcountry.countryname(country);
		} catch (NoMoodToStudyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
