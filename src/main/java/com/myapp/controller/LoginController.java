package com.myapp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myapp.beans.AdminLogin;
import com.myapp.services.AdminDao;

@Controller
public class LoginController {

	@Autowired
	 AdminDao adminDao;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String register() {
		return "display";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("adminLogin") AdminLogin adminLogin, Model m) throws IOException {
		int i = adminDao.handleAdminLogin(adminLogin);
			
		if (i > 0) {
           
			return "home";

		} else {
			m.addAttribute("msg","Username or Password Wrong please try again.");
			return "error";

		}
		
	}

}
