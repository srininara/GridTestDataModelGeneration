package com.nacnez.projects.grid.model;

import java.io.Serializable;

//@Indexed
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	//@Field
	private String firstLine;
	
	private String secondLine;

	private String country;
	
	private int postCode;
	
	private Geolocation currentLocation;
	
	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public Geolocation getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Geolocation currentLocation) {
		this.currentLocation = currentLocation;
	}

}
