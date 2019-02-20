package com.cg.ems.dto;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="supplier_master")
public class Supplier {
	@Id
	@Column(name="supp_Id",length=10)
private int suppId;
@Temporal(value=TemporalType.DATE)
private Date suppDate;

public Set<Product> getProductSet() {
	return productSet;
}
public void setProductSet(Set<Product> productSet) {
	this.productSet = productSet;
}
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="prod_supply",
   joinColumns= {
		   @JoinColumn(name="supp_id")},
          inverseJoinColumns=
      {@JoinColumn(name="prod_code")})
   
  
Set<Product> productSet=new HashSet<Product>();






public int getSuppId() {
	return suppId;
}
public void setSuppId(int suppId) {
	this.suppId = suppId;
}
public Date getSuppDate() {
	return suppDate;
}
public void setSuppDate(Date suppDate) {
	this.suppDate = suppDate;
}
public Supplier(int suppId, Date suppDate) {
	super();
	this.suppId = suppId;
	this.suppDate = suppDate;
}
public Supplier() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Supplier [suppId=" + suppId + ", suppDate=" + suppDate + ", productSet=" + productSet + "]";
}



}
