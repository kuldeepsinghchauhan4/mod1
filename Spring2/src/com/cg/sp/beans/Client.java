package com.cg.sp.beans;



import java.util.ArrayList;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Emp e=context.getBean(Emp.class);
	//ArrayList<String> l=e.getSkills();
/*	DBConfig config=context.getBean(DBConfig.class);
	System.out.println(config.getDriverName());
	System.out.println(config.getUrl());
	System.out.println(config.getUserName());
	System.out.println(config.getPassword());*/
	System.out.println(e);
	}

}
