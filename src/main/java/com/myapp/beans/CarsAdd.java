package com.myapp.beans;

import java.io.Serializable;

public class CarsAdd implements Serializable {
	private String CarID;
	private String CarModel;
	private float Rent;
	private String carStat;
	
	public CarsAdd() {
		
	}

	public String getCarID() {
		return CarID;
	}

	public void setCarID(String carID) {
		this.CarID = carID;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		this.CarModel = carModel;
	}

	public float getRent() {
		return Rent;
	}

	public void setRent(float rent) {
		this.Rent = rent;
	}

	public String getCarStatus() {
		return carStat;
	}

	public void setCarStat(String stat) {
		this.carStat = stat;
	}



}
