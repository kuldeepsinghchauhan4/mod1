package com.cg.ems.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestMany2ManyDemo {
public static void main(String arg[]) {
	EntityManager em=JPAUtil.getEntityManger();
	EntityTransaction et=em.getTransaction();
	Product p1=new Product();
	p1.setProductCode(100);
	p1.setProductName("tv");
	p1.setProductPrice(35000);
	
	Product p2=new Product();
	p2.setProductCode(200);
	p2.setProductName("Fridge");
	p2.setProductPrice(65000);
	
	Product p3=new Product();
	p3.setProductCode(300);
	p3.setProductName("CD");
	p3.setProductPrice(500);
	
	Product p4=new Product();
	p4.setProductCode(400);
	p4.setProductName("laptop");
	p4.setProductPrice(75000);
	
	Set<Product> eleProSet=new HashSet<Product>();
	eleProSet.add(p1);
	eleProSet.add(p2);
	eleProSet.add(p3);
	
	Supplier sony=new Supplier();
	sony.setSuppId(111);
	sony.setSuppDate(new Date());
	sony.setProductSet(eleProSet);

	
	
	Supplier lg=new Supplier();
	lg.setSuppId(222);
	lg.setSuppDate(new Date(2018,12,04));
	
	
	Set<Supplier> suppSet=new HashSet<Supplier>();
	suppSet.add(sony);
	suppSet.add(lg);
	p1.setSupSet(suppSet);
	et.begin();
em.persist(sony);
et.commit();
System.out.println("----persisted-----");

	
	/*Dept d1=new Dept();
	d1.setDeptCode(20);
	d1.setDeptName("Admin");
	
	Dept d2=new Dept();
	d2.setDeptCode(30);
	d2.setDeptName("Sales");
	
	Emp e1=new Emp();
	e1.setEmpName("kuldeep singh");
	e1.setEmpID(100);
    e1.setEmpSal(10000);
    e1.setEmpDept(d1);
    
    Emp e2=new Emp();
	e2.setEmpName("Prem Singh");
	e2.setEmpID(101);
    e2.setEmpSal(20000);
    e2.setEmpDept(d1);
    
    Emp e3=new Emp();
	e3.setEmpName("kuldeep singh");
	e3.setEmpID(200);
    e3.setEmpSal(1000);
    e3.setEmpDept(d2);
    
    Emp e4=new Emp();
	e4.setEmpName("Anju");
	e4.setEmpID(7000);
    e4.setEmpSal(70000);
    e4.setEmpDept(d2);
    
    Set<Emp> adminEmpSet=new HashSet<Emp>();
    adminEmpSet.add(e1);
    adminEmpSet.add(e2);
   Set<Emp> salesEmpSet=new HashSet<Emp>();
    salesEmpSet.add(e3);
    salesEmpSet.add(e4);
    d1.setEmpset(adminEmpSet);
    d2.setEmpset(salesEmpSet);
    et.begin();
    em.persist(d1);
    em.persist(d2);
 
    et.commit();
    System.out.println("--------dept persisted---------");*/

    
    
	/*Address vAddress=new Address();
	vAddress.setCity("pune");
	vAddress.setState("maharashtra");
	vAddress.setStreet("singhagad road");
	vAddress.setZipcode(281406);

	Address rAddress=new Address();
	rAddress.setCity("pune");
	rAddress.setState("mh");
	rAddress.setStreet("singhagad road");
	rAddress.setZipcode(41101);
Student kul=new Student();
kul.setStudName("kuldeep");
kul.setStudAdd(vAddress);

Student son=new Student();
son.setStudName("son");
son.setStudAdd(rAddress);
et.begin();
em.persist(kul);
em.persist(son);
et.commit();
System.out.println("data inserted");
Student st=em.find(Student.class, 52);
System.out.println(st);
et.begin();
em.remove(st);
et.commit();*/
}
}
