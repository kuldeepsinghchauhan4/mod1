package com.capgemini.bank.repo;

import com.capgemini.bank.bean.Customer;

public interface Bankrepo {
	public boolean save(Customer customer);
	public Customer findOne(String mobileNo);

}