package com.capgemini.bank.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Embeddable

public class Wallet {
	@Column(name="cust_bal",length=6)
	private BigDecimal balance;

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Wallet(BigDecimal balance) {
		super();
		this.balance = balance;
	}

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}
	
}