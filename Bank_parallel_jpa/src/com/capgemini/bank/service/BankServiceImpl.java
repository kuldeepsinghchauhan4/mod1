package com.capgemini.bank.service;

import java.math.BigDecimal;

import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.bean.Wallet;
import com.capgemini.bank.exception.AccountDoesNotExist;
import com.capgemini.bank.exception.InsufficientBalanceException;
import com.capgemini.bank.repo.Bankrepo;
import com.capgemini.bank.repo.BankrepoImpl;

public class BankServiceImpl implements BankService {
	Bankrepo brepo= new BankrepoImpl();
	Customer cust= new Customer();
	Wallet wall= new Wallet();
	public Customer createAccount(String name,String mobileNo,BigDecimal amount) 
	{
		Wallet wallet=new Wallet(amount);
		Customer cust= new Customer(name,mobileNo,wallet);
		brepo.save(cust);
		return cust;
	}
	public Customer showBalance(String mobileNo) throws AccountDoesNotExist
	{
		return brepo.findOne(mobileNo);
		
	}
	public Customer fundTransfer(String sourceMobileNo,String targetMobileNo,BigDecimal amount) throws AccountDoesNotExist,InsufficientBalanceException
	{
		cust = brepo.findOne(sourceMobileNo);
		wall = cust.getWallet();
		wall.setBalance(wall.getBalance().subtract(amount));
		brepo.updateCust(cust);

		cust=brepo.findOne(targetMobileNo);
		wall = cust.getWallet();
		wall.setBalance(wall.getBalance().add(amount));
		cust.setWallet(wall);
		brepo.updateCust(cust);
		return brepo.findOne(sourceMobileNo);
	}
	public Customer depositAmount(String mobileNo,BigDecimal amount) throws AccountDoesNotExist,InsufficientBalanceException
	{
		Customer cust=brepo.findOne(mobileNo);
		Wallet wall=cust.getWallet();
		wall.setBalance(wall.getBalance().add(amount));
		brepo.updateCust(cust);
		cust.setWallet(wall);
		return cust;
		
	}
	public Customer withdrawAmount(String mobileNo,BigDecimal amount) throws AccountDoesNotExist,InsufficientBalanceException
	{
		Customer cust=brepo.findOne(mobileNo);
		Wallet wall=cust.getWallet();
		wall.setBalance(wall.getBalance().subtract(amount));
		brepo.updateCust(cust);
		cust.setWallet(wall);
		return cust;
		
	}
	

}