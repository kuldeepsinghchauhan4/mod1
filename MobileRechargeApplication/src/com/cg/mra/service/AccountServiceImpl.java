package com.cg.mra.service;


import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
       Account a=new Account();
	  AccountDaoImpl a1=new  AccountDaoImpl();
	@Override
	public
	Account getAccountDetails(String mobno) {
	
		 a= a1.getAccountDetails("7500800149");
		return a;
		
	}
	@Override
	public

	int rechargeAccount(String mobno,double rechargeAmount) {
		int r=a1.rechargeAccount("7500800149", 500.00);
		return r;
	}

}
