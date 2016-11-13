package com.deep.training.mapexample;

import java.util.HashMap;
import java.util.Map;

public class MapLauncher {
	
	public static void main(String[] args ){
		
		Map<String, String> countryMap =new HashMap<>();
		
		countryMap.put("India", "New Delhi");
		
		countryMap.put("Romania", "Bucarest");
		countryMap.put("India1", "New Delhi");
		countryMap.put("Romania", "Bucarest");
		//countryMap.put("India", null);
		countryMap.put(null, "12Test");
		countryMap.put(null, null);
		countryMap.put(null, "Test");
		
		System.out.println(countryMap);
		
		System.out.println(countryMap.get("India"));
		System.out.println(countryMap.get("India japan"));
		System.out.println(countryMap.get(null));
	
		System.out.println(countryMap.keySet());
		System.out.println(countryMap.values());
		
		
		
	}

}
