package com.cg.sb.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	@Value("kuldeep")
	private String firstname;
	@Value("singh")
	private String lastname;
	@Autowired
	private Dept dept;
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@PostConstruct
	public void init() {
		System.out.println("initilization work");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("cleanup work");
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", dept=" + dept + "]";
	}

}
