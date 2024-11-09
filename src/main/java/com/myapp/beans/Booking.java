package com.myapp.beans;

import java.io.Serializable;

public class Booking implements Serializable {
	private int BookId;
	private String CustomerID;
	private String CarID;

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getCarID() {
		return CarID;
	}

	public void setCarID(String carID) {
		CarID = carID;
	}

	public Booking() {
	}



}
