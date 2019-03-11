package com.capgemini.bank.repo;

import com.capgemini.bank.bean.Customer;

public interface Bankrepo {
	public Customer save(Customer customer);
	public Customer findOne(String mobileNo);
	public Customer updateCust(Customer customer);
}