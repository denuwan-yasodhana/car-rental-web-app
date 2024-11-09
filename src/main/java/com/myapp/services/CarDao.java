package com.myapp.services;

import com.myapp.beans.Cars;
import com.myapp.beans.CarsAdd;
import com.myapp.beans.Customer;
import com.myapp.enums.CarStatus;
import com.myapp.enums.CusStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class CarDao {
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

public boolean save(CarsAdd car) {
	String sql = "INSERT INTO cars(CarID, CarModel, Rent, Status) VALUES('"+car.getCarID()+"','"+car.getCarModel()+"','"+car.getRent()+"','"+car.getCarStatus()+"')";
	return template.update(sql) > 0;
}
	public boolean edit(CarsAdd car) {
		String sql = "Update  cars set CarModel=?, Rent=?, Status=? Where  CarID=?";
		return template.update(sql,car.getCarModel(),car.getRent(),car.getCarStatus(),car.getCarID()) > 0;
	}
	
	public boolean deleteByID(String ID)
	{
		String sql = "DELETE FROM cars WHERE CarID = '"+ID+"'";
		return template.update(sql) > 0;
	}

	public List<Cars> getCarDetails(){
		return template.query("SELECT * FROM cars", new RowMapper<Cars>() {
			public Cars mapRow(ResultSet rs, int row) throws SQLException {
				Cars cars = new Cars();
				cars.setCarid(rs.getString(1));
				cars.setCarmodel(rs.getString(2));
				cars.setRent(rs.getString(3));
				cars.setStatus(rs.getString(4));
				return cars;
			}
		});
	}

	public Cars getCarDetailsByid(String id){
		return template.queryForObject("SELECT * FROM cars where CarID=?",new Object[]{id}, new RowMapper<Cars>() {
			public Cars mapRow(ResultSet rs, int row) throws SQLException {
				Cars cars = new Cars();
					cars.setCarid(rs.getString(1));
					cars.setCarmodel(rs.getString(2));
					cars.setRent(rs.getString(3));
					cars.setStatus(rs.getString(4));
				return cars;
			}
		});
	}

	public boolean BookByID(String carID, String custID, boolean equals) {
		if(equals)
		{
			String sql3 = "Update  cars set Status=? Where  CarID=?";
			String sql = "INSERT INTO book(CustomerID, CarID) VALUES('"+custID+"','"+carID+"')";
			String sql2 = "Update  customer set  CustomerStatus=? Where  CustomerID=?";
			return template.update(sql2, CusStatus.Ineligible.toString(),custID) > 0 && template.update(sql) > 0 &&template.update(sql3,CarStatus.OnRent.toString(),carID) > 0;
		}
		else
		{
			return false;
		}
	}

	public boolean GiveService(String carID, boolean equals) {
		if(equals) {
			String sql = "Update  cars set Status=? Where  CarID=?";
			return template.update(sql, CarStatus.OnService.toString(), carID) > 0;
		}
		else
		{
			return false;
		}
	}

	public boolean ReturnByID(String carID, String custID, boolean equals) {
		if(equals)
		{
			String sql = "Update  cars set Status=? Where  CarID=?";
			String sql2 = "Update  customer set  CustomerStatus=? Where  CustomerID=?";
			String sql3 = "DELETE FROM book WHERE CustomerID = ? AND CarID= ?";

			return template.update(sql2, CusStatus.Eligible.toString(),custID) > 0 && template.update(sql3,custID,carID) > 0 && template.update(sql,CarStatus.Available.toString(),carID) > 0;
		}
		else
		{
			return false;
		}
	}
}
