package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao {
	Map<String, Account> accountEntry = new HashMap<String, Account>();

	public AccountDaoImpl() {
		accountEntry.put("7500800149", new Account("prepaid", "kuldeep", 200));
		accountEntry.put("7500800150", new Account("prepaid", "singh", 201));
	}

	@Override
	public Account getAccountDetails(String mobileno) {
		for (Map.Entry m : accountEntry.entrySet()) {
			if (m.getKey().equals(mobileno)) {
				return (Account) m.getValue();
			}
			/*
			 * else { System.out.println("no. not found"); }
			 */
		}
		return null;
	}

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		for (Map.Entry m : accountEntry.entrySet()) {
			if (m.getKey().equals(mobileno)) {
				double d = (((Account) m.getValue()).getAccountBalance());
				((Account) m.getValue()).setAccountBalance(d + rechargeAmount);
				System.out.println("recharge  done successfully");
				return (int) (d + rechargeAmount);
			}
			/*
			 * else { System.out.println("recharge not done successfully"); }
			 */
		}

		return 0;
	}

}
