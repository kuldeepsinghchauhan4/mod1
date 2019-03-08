package com.cg.spring.maven1.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springmvc.bean.Customer;
import com.cg.springmvc.service.ICustomerService;



@RestController
public class MyRestController {
	
	@Autowired
	ICustomerService service;
	
	
	public ICustomerService getService() {
		return service;
	}


	public void setService(ICustomerService service) {
		this.service = service;
	}


	/*@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public Customer addCustomer(@RequestParam("fname")String firstName,
			@RequestParam("lname")String lastName,
			@RequestParam("age")int age,
			@RequestParam("city")String city,
			@RequestParam("email")String email,
			@RequestParam("mobileNo")String mobileNo) {
		Customer c=new Customer();
		c.setFirstName(firstName);
		c.setLastName(lastName);
		c.setAge(age);
		c.setCity(city);
		c.setEmail(email);
		c.setMobileNo(mobileNo);
		c=service.addCustomer(c);
		return c;
	}
	@RequestMapping(value="/getCustomer/{custid}",produces="applicatiomn/json")
	public Customer findCustomer(@PathVariable int custid) {
		Customer c=service.findCustomer(custid);
		return c;
		
	}*/
	@RequestMapping(value="/addCustomer",consumes="application/json",produces="application/json",method=RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer) {
		customer=service.addCustomer(customer);
		return customer;
	}
	@RequestMapping(value="updateCustomer",consumes="application/json",produces="application/json",method=RequestMethod.POST)
public Customer updateCustomer(@RequestBody Customer customer) {
	customer=service.updateCustomer(customer);
	return customer;
}
	@RequestMapping(value="/deleteCustomer/{customerId}",consumes="application/json",produces="application/json",method=RequestMethod.GET)
public Customer deleteCustomer(@PathVariable int customerId) {
		Customer customer=service.deleteCustomer(customerId);
		return customer;
		
	}
	@RequestMapping(value="getCustomerList",produces="application/json")
	public List<Customer> getCustomerList(){
		List<Customer> list=service.getCustomerList();
		return list;
	}
	@RequestMapping(value="/getCustomer/{custid}",produces="application/json",method=RequestMethod.POST)
	public Customer findCustomer(@PathVariable int custid) {
		Customer customer=service.findCustomer(custid);
		return customer;
	}
}

