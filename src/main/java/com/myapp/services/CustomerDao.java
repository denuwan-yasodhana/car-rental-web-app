package com.myapp.services;

import com.myapp.beans.Customer;
import com.myapp.beans.CustomersAdd;
import com.myapp.enums.CarStatus;
import com.myapp.enums.CusStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CustomerDao {

	BookDao bookDao;
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

public boolean save(CustomersAdd customers) {
	String sql = "INSERT INTO customer(CustomerID, CustomerName, PhoneNumber, Address) VALUES('"+customers.getCustomerID()+"','"+customers.getCustomerName()+"','"+customers.getPhoneNumber()+"','"+customers.getAddress()+"')";
	return template.update(sql) > 0;
}

	public boolean cusEdit(CustomersAdd customers) {
		String sql = "UPDATE customer SET CustomerName=?, PhoneNumber=?, Address=? WHERE CustomerID=?";
		return template.update(sql, customers.getCustomerName(), customers.getPhoneNumber(), customers.getAddress(), customers.getCustomerID()) > 0;
	}
	
	public boolean deleteByID(String customerID)
	{
		String sql = "DELETE FROM customer WHERE CustomerID = '"+customerID+"'";
		return template.update(sql) > 0;
	}

	public List<Customer> getCustomerDetails(){
		return template.query("SELECT * FROM customer", new RowMapper<Customer>() {
			public Customer mapRow(ResultSet rs, int row) throws SQLException {
				Customer customer=new Customer();
				customer.setCustomerid(rs.getString(1));
				customer.setCustomername(rs.getString(2));
				customer.setPhonenumber(rs.getString(3));
				customer.setAddress(rs.getString(4));
				customer.setCusStatus(rs.getString(5));
				return customer;
			}
		});

	}

	public Customer getCustomerDetailsById(String id){
		return template.queryForObject("SELECT * FROM customer WHERE CustomerID=?",new Object[]{id}, new RowMapper<Customer>() {
			public Customer mapRow(ResultSet rs, int row) throws SQLException {
				Customer customer=new Customer();
				customer.setCustomerid(rs.getString(1));
				customer.setCustomername(rs.getString(2));
				customer.setPhonenumber(rs.getString(3));
				customer.setAddress(rs.getString(4));
				customer.setCusStatus(rs.getString(5));
				return customer;
			}
		});

	}




}
