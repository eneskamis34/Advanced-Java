package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerservice = context.getBean("service",ICustomerService.class);
		customerservice.Add();
		
		//CustomerManager cm = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//cm.Add();

	}

}
