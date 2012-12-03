package com.nacnez.projects.grid.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Geolocation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double latitude;
	private Double longitude;
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	

}
