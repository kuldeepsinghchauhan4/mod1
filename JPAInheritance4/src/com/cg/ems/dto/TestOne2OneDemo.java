package com.cg.ems.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestOne2OneDemo {
public static void main(String arg[]) {
	EntityManager em=JPAUtil.getEntityManger();
	EntityTransaction et=em.getTransaction();
	Address vAddress=new Address();
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
et.commit();
}
}
