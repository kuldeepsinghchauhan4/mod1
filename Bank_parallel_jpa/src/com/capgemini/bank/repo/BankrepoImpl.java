package com.capgemini.bank.repo;

import java.util.LinkedList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.util.JPAUtil;

public class BankrepoImpl implements Bankrepo {
	
	EntityManager em= JPAUtil.getEntityManager();
	EntityTransaction entityTran=em.getTransaction();
	
	LinkedList<Customer> linkl= new LinkedList<>();
	public Customer save(Customer customer)
	{
		entityTran.begin();
		em.persist(customer);
		entityTran.commit();
		
		return customer;
	}
	public Customer findOne(String mobileNo)
	{
		Customer cust= em.find(Customer.class, mobileNo);
		return cust;
		
	}
	
	public Customer updateCust(Customer customer)
	{
		Customer cust=em.find(Customer.class, customer.getMobileNo());
		cust.setWallet(customer.getWallet());
		entityTran.begin();
		em.merge(cust);
		entityTran.commit();
		return cust;
	}
	
}