package com.capgemini.bank.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust")
public class Customer {
	@Id
	@Column(name="cust_mobile",length=10)
	private String mobileNo;
	@Column(name="cust_name",length=15)
	private String name;
	@Embedded
	private Wallet wallet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public Customer(String name, String mobileNo, Wallet wallet) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.wallet = wallet;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNo=" + mobileNo + ", wallet=" + wallet + "]";
	}
	
	
	
}