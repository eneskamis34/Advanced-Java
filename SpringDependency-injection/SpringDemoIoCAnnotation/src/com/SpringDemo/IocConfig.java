package com.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.SpringDemo")
@PropertySource("classpath:values.properties")
public class IocConfig {
	
	
	
	
	//sayfalar�n �zerine tek tek @Component("database") bunu yazmak yerine:
	@Bean
	public ICustomerDal database()
	{
		return new MssqlCustomerDal(); //sadece buray� de�i�tirmek yeter.
	}
	
	@Bean
	public ICustomerService service()
	{
		return new CustomerManager(database()); //sadece buray� de�i�tirmek yeter.
	}


}
