package com.myapp.controller;

import com.myapp.beans.*;
import com.myapp.enums.CarStatus;
import com.myapp.enums.CusStatus;
import com.myapp.services.BookDao;
import com.myapp.services.CarDao;
import com.myapp.services.CustomerDao;
import com.myapp.services.DriverDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;
import java.util.List;


@Controller
public class MyController {
	@Autowired
	CarDao carDao;
	@Autowired
	CustomerDao customerDao;
	@Autowired
	DriverDao driverDao;

	@Autowired
	BookDao bookDao;


	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("cars") CarsAdd carsAdd, Model m) {
		if(carDao.save(carsAdd)) {
			m.addAttribute("msg", "added successfully");
		}
		else {
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
		return "display";
	}

	@RequestMapping(value = "/registerCus", method = RequestMethod.POST)
	public String registerCus (@ModelAttribute("customers") CustomersAdd cusAdd, Model m) {
		if(customerDao.save(cusAdd)) {
			m.addAttribute("msg", "added successfully");
		}
		else {
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
		return "display";
	}

	@RequestMapping(value = "/registerDriv", method = RequestMethod.POST)
	public String registerDriv (@ModelAttribute("driver") DriversAdd driversAdd, Model m) {
		if(driverDao.save(driversAdd)) {
			m.addAttribute("msg", "added successfully");
		}
		else {
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
		return "display";
	}

	@RequestMapping("/viewdriver")
	public String viewdriver(Model m) {
		List<CarDriver> list = driverDao.getCarDriverDetails();
		m.addAttribute("list",list);
		return "viewdriver";

	}

	@RequestMapping("/viewcustomer")
	public String viewcustomer(Model m) {
		List<Customer> list = customerDao.getCustomerDetails();
		m.addAttribute("list",list);
		return "viewcustomer";
	}

	@RequestMapping("/viewcar")
	public String viewcars(Model m) {
		List<Cars> list = carDao.getCarDetails();
		m.addAttribute("list",list);
		return "viewcar";
	}

	@RequestMapping("/searchcar/{id}")
	public String searchcar(@PathVariable("id") String id, Model m) {
		try
		{
			Cars cars= carDao.getCarDetailsByid(id);
			m.addAttribute("cars",cars);
			return "searchcar";
		}
		catch (Exception e)
		{
			m.addAttribute("msg","Searched car not in our board");
			return "display";
		}

	}

	@RequestMapping("/searchcustomer/{id}")
	public String searchcus(@PathVariable("id") String id, Model m) {
		try
		{
			Customer customer= customerDao.getCustomerDetailsById(id);
			m.addAttribute("customer",customer);
			return "searchcus";
		}
		catch (Exception e)
		{
			m.addAttribute("msg","Searched Customer not in our record");
			return "display";
		}

	}

	@RequestMapping("/searchdriver/{id}")
	public String searchdrive(@PathVariable("id") String id, Model m) {
		try
		{
			CarDriver driver = driverDao.getCarDriverDetailsById(id);
			m.addAttribute("driver",driver);
			return "searchdriver";
		}
		catch (Exception e)
		{
			m.addAttribute("msg","Searched driver never worked here");
			return "display";
		}

	}

	@RequestMapping(value = "/changecus/{id}")
	public String changecus(@PathVariable String id, Model m) {
		m.addAttribute("command",customerDao.getCustomerDetailsById(id));
		return "CustomerEdit";
	}
	@RequestMapping(value = "/EditCus", method = RequestMethod.POST)
	public String EditCus (@ModelAttribute("customers") CustomersAdd cusAdd, Model m) {
		if(customerDao.cusEdit(cusAdd)) {
			m.addAttribute("msg", "Edited successfully");
		}
		else {
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
		return "display";
	}
	@RequestMapping(value = "/changedriver/{id}")
	public String changedriver(@PathVariable String id, Model m) {
		m.addAttribute("command",driverDao.getCarDriverDetailsById(id));
		return "DriverEdit";
	}
	@RequestMapping(value = "/EditDriver", method = RequestMethod.POST)
	public String EditDriver (@ModelAttribute("driver") DriversAdd driversAdd, Model m) {
		if(driverDao.EditDri(driversAdd)) {
			m.addAttribute("msg", "Edited successfully");
		}
		else {
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
		return "display";
	}

	@RequestMapping(value = "/changecar/{id}")
	public String changecar(@PathVariable String id, Model m) {
		m.addAttribute("command",carDao.getCarDetailsByid(id));
		return "CarEdit";
	}
	@RequestMapping(value = "/editcar", method = RequestMethod.POST)
	public String editcar(@ModelAttribute("cars") CarsAdd carsAdd, Model m) {
		if(carDao.edit(carsAdd)) {
			m.addAttribute("msg", "Edited successfully");
		}
		else {
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
		return "display";
	}
	
	@RequestMapping(value = "/deletecar/{CarID}")
    public String deleteCar(@PathVariable String CarID, Model m)
    {
		if(carDao.deleteByID(CarID))
		{
			m.addAttribute("msg", "Car details deleted successfully");
		}
		else
		{
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
        return "display";
    }

	@RequestMapping(value = "/deletecustomer/{customerID}")
	public String deleteCustomer(@PathVariable("customerID") String customerID, Model m)
	{
        if(customerDao.deleteByID(customerID))
        {
            m.addAttribute("msg", "Customer details deleted successfully");
        }
        else
        {
            m.addAttribute("msg", "Error occurred. Please try again.");
        }
		return "display";
	}

	@RequestMapping(value = "/deletedriver/{DriversID}")
	public String deleteDriver(@PathVariable("DriversID") String DriversID, Model m)
	{
		if(driverDao.deleteByID(DriversID))
		{
			m.addAttribute("msg", "Driver details deleted successfully");
		}
		else
		{
			m.addAttribute("msg", "Error occurred. Please try again.");
		}
		return "display";
	}

	@RequestMapping(value = "/actioncar/{CarID}")
		public String actioncar(@PathVariable("CarID") String CarID, Model m) {
			m.addAttribute("command",carDao.getCarDetailsByid(CarID));
		return "action";
	}

	@RequestMapping(value = "/bookingcar/{CarID}")
	public String bookingCar(@PathVariable("CarID") String CarID, Model m) {
		m.addAttribute("command",carDao.getCarDetailsByid(CarID));
		return "bookcar";
	}


	@RequestMapping(value = "/bookcar/{CarID}/{customerID}")
	public String bookcar(@PathVariable("CarID") String CarID, @PathVariable("customerID") String CustID, Model m)
	{
		if(carDao.BookByID(CarID, CustID, carDao.getCarDetailsByid(CarID).getStatus().equals(CarStatus.Available.toString())&& customerDao.getCustomerDetailsById(CustID).getCusStatus().equals(CusStatus.Eligible.toString())))
		{
			m.addAttribute("msg", "Booked");
		}
		else if(carDao.getCarDetailsByid(CarID).getStatus().equals(CarStatus.OnService.toString()))
		{
			m.addAttribute("msg", "Sorry this car is on service");
		}
		else if(carDao.getCarDetailsByid(CarID).getStatus().equals(CarStatus.OnRent.toString()))
		{
			m.addAttribute("msg", "Sorry this car is Already on rent");
		}
		else if(customerDao.getCustomerDetailsById(CustID).getCusStatus().equals(CusStatus.Ineligible.toString()))
		{
			m.addAttribute("msg", "Sorry customer already need to return a car");
		}
		return "display";
	}

	@RequestMapping(value = "/returningcar/{CustID}")
	public String returningCar(@PathVariable("CustID") String CustID, Model m) {
		try
		{
			m.addAttribute("command",bookDao.getBookDetailsByid(CustID));
			return "returncar";
		}
		catch (Exception e)
		{
			m.addAttribute("msg", "This customer don't have any rent cars");
			return "display";
		}


	}

	@RequestMapping(value = "/returnThecar/{CarID}/{customerID}")
	public String returncar(@PathVariable("CarID") String CarID, @PathVariable("customerID") String CustID, Model m)
	{

		if(carDao.ReturnByID(CarID, CustID, carDao.getCarDetailsByid(CarID).getStatus().equals(CarStatus.OnRent.toString())&& customerDao.getCustomerDetailsById(CustID).getCusStatus().equals(CusStatus.Ineligible.toString()))){
			m.addAttribute("msg", "Returned");
		}

		else
		{
			m.addAttribute("msg", "I don't know");
		}
		return "display";
	}

	@RequestMapping(value = "/servicecar/{CarID}")
	public String giveService(@PathVariable("CarID") String CarID, Model m)
	{
		if(carDao.GiveService(CarID, carDao.getCarDetailsByid(CarID).getStatus().equals(CarStatus.Available.toString())))
		{
			m.addAttribute("msg", "Sent to Service");
		}
		else if(carDao.getCarDetailsByid(CarID).getStatus().equals(CarStatus.OnService.toString()))
		{
			m.addAttribute("msg", "Sorry this car is Already in Service");
		}
		else if(carDao.getCarDetailsByid(CarID).getStatus().equals(CarStatus.OnRent.toString()))
		{
			m.addAttribute("msg", "Sorry this car is on Rent");
		}
		return "display";
	}
}
