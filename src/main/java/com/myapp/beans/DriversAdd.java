package com.myapp.beans;

import java.io.Serializable;

public class DriversAdd implements Serializable {
	private String DriversID;
	private String DriverName;
	private String phoneNumber;
	private String ExperienceFrom;
	private String address;

	public DriversAdd() {
		
	}
	public String getExperienceFrom() {
		return ExperienceFrom;
	}

	public void setExperienceFrom(String experienceFrom) {
		ExperienceFrom = experienceFrom;
	}

	public String getDriversID() {
		return DriversID;
	}

	public void setDriversID(String driversID) {
		this.DriversID = driversID;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		this.DriverName = driverName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String stat) {
		this.address = stat;
	}



}
