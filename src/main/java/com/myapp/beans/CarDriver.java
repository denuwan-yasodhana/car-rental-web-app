package com.myapp.beans;

import java.io.Serializable;

public class CarDriver implements Serializable{
	private String driverid;
	private String drivername;
	private String experienceform;
	private String phonenumber;
	private String address;
	
	public CarDriver() {
		
	}

	public String getDriverid() {
		return driverid;
	}

	public void setDriverid(String driverid) {
		this.driverid = driverid;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getExperienceform() {
		return experienceform;
	}

	public void setExperienceform(String experienceform) {
		this.experienceform = experienceform;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
