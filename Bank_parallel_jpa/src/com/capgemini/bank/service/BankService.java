package com.capgemini.bank.service;

import java.math.BigDecimal;
import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.exception.AccountDoesNotExist;
import com.capgemini.bank.exception.InsufficientBalanceException;

public interface BankService {
	public Customer createAccount(String name,String mobileNo,BigDecimal amount);
	public Customer showBalance(String mobileNo) throws AccountDoesNotExist;
	public Customer fundTransfer(String sourceMobileNo,String targetMobileNo,BigDecimal amount) throws AccountDoesNotExist,InsufficientBalanceException;
	public Customer depositAmount(String mobileNo,BigDecimal amount) throws AccountDoesNotExist,InsufficientBalanceException;
	public Customer withdrawAmount(String mobileNo,BigDecimal amount) throws AccountDoesNotExist,InsufficientBalanceException;
	
}