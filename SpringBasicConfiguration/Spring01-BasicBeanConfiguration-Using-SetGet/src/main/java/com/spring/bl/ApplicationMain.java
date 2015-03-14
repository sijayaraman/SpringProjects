package com.spring.bl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {

		//Create container and init with bean config
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/beans/bean-config.xml");
		
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
