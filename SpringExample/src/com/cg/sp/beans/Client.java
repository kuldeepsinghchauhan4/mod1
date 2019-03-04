package com.cg.sp.beans;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	
	public static void main(String[] args) {
		Resource res=new ClassPathResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Employee emp=(Employee)factory.getBean("emp1");
		Employee emp2=(Employee)factory.getBean("emp2");
		System.out.println(emp);
		System.out.println(emp2);
		/*UserCred users=factory.getBean(UserCred.class);
		System.out.println(users);*/
System.out.println("back to main");
	}

}
