package com.myapp.beans;

import java.io.Serializable;

public class CustomersAdd implements Serializable {
	private String customerID;
	private String customerName;
	private String phoneNumber;
	private String address;



	private String cusStatus;

	public CustomersAdd() {
		
	}
	public String getCusStatus() {
		return cusStatus;
	}
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
