package com.cg.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="add_id",length=10)
	private int addId;
@Column(name="street",length=25)
private String street;
@Column(name="city",length=25)
private String city;
@Column(name="zipcode",length=6)
private int zipcode;
@Column(name="state",length=25)
private String state;

public int getAddId() {
	return addId;
}

public void setAddId(int addId) {
	this.addId = addId;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getZipcode() {
	return zipcode;
}

public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public Address(int addId, String street, String city, int zipcode, String state) {
	super();
	this.addId = addId;
	this.street = street;
	this.city = city;
	this.zipcode = zipcode;
	this.state = state;
}

public Address() {
	// TODO Auto-generated constructor stub
}



}
