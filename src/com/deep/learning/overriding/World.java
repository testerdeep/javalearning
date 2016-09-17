package com.deep.learning.overriding;

import com.deep.training.exceptionhandelingexample.NoMoodToStudyException;

public class World {
	public String countryname="India";
	
	public void countryname(Country  world) throws NoMoodToStudyException{
		
		World newworld= (World) world;
		
		System.out.println(world.countryname);
		
		
	}

}
