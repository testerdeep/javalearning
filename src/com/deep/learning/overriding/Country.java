package com.deep.learning.overriding;

import com.deep.training.exceptionhandelingexample.NoMoodToStudyException;

public class Country extends World {
	
	String countryname="Japan";
	@Override
	
	public void countryname(Country country) throws NoMoodToStudyException{
		
		//Country other= (Country) country;
		System.out.println(country.countryname);
		
		
	}

}
