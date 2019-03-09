package com.capgemini.bank.repo;

import java.util.LinkedList;
import java.util.ListIterator;

import com.capgemini.bank.bean.Customer;

public class BankrepoImpl implements Bankrepo {
	LinkedList<Customer> linkl= new LinkedList<>();
	public boolean save(Customer customer)
	{
		return linkl.add(customer);
	}
	public Customer findOne(String mobileNo)
	{
		ListIterator<Customer> listit= linkl.listIterator();
		while(listit.hasNext())
		{
			Customer cust=listit.next();
			if(cust.getMobileNo().equals(mobileNo))
			{
				return cust;
			}
		}
		return null;
	}

}