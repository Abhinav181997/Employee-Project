package com.capgemini.beans;

public class Country {

	private String country;
	City city;
	public Country(String country, City city) {
		super();
		this.country = country;
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Country [country=" + country + ", city=" + city + "]";
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
