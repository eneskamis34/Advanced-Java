package com.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		
		//Annotation yöntemi
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		
		
		
		//ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
		//customerDal.Add();
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.Add();
		


	}

}
