package com.cg.ems.dto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
private static EntityManagerFactory emf=null;
private static EntityManager em=null;
public static EntityManager getEntityManger() {
	emf=Persistence.createEntityManagerFactory("Oracle-JPA-PU");
	em=emf.createEntityManager();
	return em;
}
}
