package com.myapp.services;

import org.springframework.jdbc.core.JdbcTemplate;

import com.myapp.beans.AdminLogin;

public class AdminDao {

     JdbcTemplate template;

   
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int handleAdminLogin(AdminLogin adminLogin) {      
        String query = "SELECT id FROM admin WHERE username = ? AND password = ?";
        try {
            int id = template.queryForObject(query, Integer.class, adminLogin.getUsername(), adminLogin.getPassword());
            return id ;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
