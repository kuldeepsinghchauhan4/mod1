package com.capgemini.bank.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bank.exception.AccountDoesNotExist;
import com.capgemini.bank.exception.InsufficientBalanceException;
import com.capgemini.bank.repo.Bankrepo;
import com.capgemini.bank.repo.BankrepoImpl;
import com.capgemini.bank.service.BankService;
import com.capgemini.bank.service.BankServiceImpl;

public class BankTest {
	
	Bankrepo brepo=new BankrepoImpl();
	BankService bser=new BankServiceImpl();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		bser.createAccount("komal", "7894561230",new BigDecimal(7800));
	}
	@Test
	public void test1() {
		bser.createAccount("komal", "7894561230",new BigDecimal(7800));
		bser.createAccount("sonal", "8574961230",new BigDecimal(7800));
	}
}
