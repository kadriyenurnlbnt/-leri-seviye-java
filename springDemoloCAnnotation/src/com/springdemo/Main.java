package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		
		//context.refresh();
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		
		//CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		customerService.add();

	}

}
