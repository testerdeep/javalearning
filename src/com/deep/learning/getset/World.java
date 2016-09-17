package com.deep.learning.getset;

public class World {
	private String continent="Asia";
	private String countries;
	private String ocean;
    private String mountain;
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public String getOcean() {
		return ocean;
	}
	public void setOcean(String ocean) {
		this.ocean = ocean;
	}
	public String getMountain() {
		return mountain;
	}
	public void setMountain(String mountain) {
		this.mountain = mountain;
	}
}
