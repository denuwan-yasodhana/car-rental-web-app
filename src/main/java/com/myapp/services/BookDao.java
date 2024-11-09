package com.myapp.services;

import com.myapp.beans.Booking;
import com.myapp.beans.Cars;
import com.myapp.beans.CarsAdd;
import com.myapp.enums.CarStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class BookDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public Booking getBookDetailsByid(String id) {
		return template.queryForObject("SELECT * FROM book where CustomerID=?", new Object[]{id}, new RowMapper<Booking>() {
			public Booking mapRow(ResultSet rs, int row) throws SQLException {
				Booking booking = new Booking();
				booking.setBookId(rs.getInt(1));
				booking.setCustomerID(rs.getString(2));
				booking.setCarID(rs.getString(3));
				return booking;
			}
		});
	}
}
