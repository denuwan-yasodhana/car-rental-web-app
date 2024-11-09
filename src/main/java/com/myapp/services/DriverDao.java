package com.myapp.services;

import com.myapp.beans.CarDriver;
import com.myapp.beans.DriversAdd;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DriverDao {
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

public boolean save(DriversAdd driversAdd) {
	String sql = "INSERT INTO driver(DriverID,DriverName,ExperienceFrom,PhoneNumber,Address) VALUES('"+driversAdd.getDriversID()+"','"+driversAdd.getDriverName()+"','"+driversAdd.getExperienceFrom()+"','"+driversAdd.getPhoneNumber()+"','"+driversAdd.getAddress()+"')";
	return template.update(sql) > 0;
}
	public boolean EditDri(DriversAdd driversAdd) {
		String sql = "UPDATE driver SET DriverName=?, ExperienceFrom=?, PhoneNumber=? ,Address=? , DriverID=?";
		return template.update(sql, driversAdd.getDriverName(), driversAdd.getExperienceFrom(), driversAdd.getPhoneNumber(), driversAdd.getAddress(), driversAdd.getDriversID()) > 0;
	}
	
	public boolean deleteByID(String driversID)
	{
		String sql = "DELETE FROM driver WHERE DriverID = '"+driversID+"'";
		return template.update(sql) > 0;
	}

	public List<CarDriver> getCarDriverDetails(){
		return template.query("SELECT * FROM driver", new RowMapper<CarDriver>() {
			public CarDriver mapRow(ResultSet rs, int row) throws SQLException {
				CarDriver cardriver=new CarDriver();
				cardriver.setDriverid(rs.getString(1));
				cardriver.setDrivername(rs.getString(2));
				cardriver.setExperienceform(rs.getString(3));
				cardriver.setPhonenumber(rs.getString(4));
				cardriver.setAddress(rs.getString(5));
				return cardriver;
			}
		});

	}
	public CarDriver getCarDriverDetailsById(String id){
		return template.queryForObject("SELECT * FROM driver WHERE DriverID=? ",new Object[]{id}, new RowMapper<CarDriver>() {
			public CarDriver mapRow(ResultSet rs, int row) throws SQLException {
				CarDriver cardriver=new CarDriver();
				cardriver.setDriverid(rs.getString(1));
				cardriver.setDrivername(rs.getString(2));
				cardriver.setExperienceform(rs.getString(3));
				cardriver.setPhonenumber(rs.getString(4));
				cardriver.setAddress(rs.getString(5));
				return cardriver;
			}
		});

	}



}
