package com.SpringDemo;

public class CustomerManager implements ICustomerService
{
	private ICustomerDal customer;
	
	
	//constructor enjection 
	public CustomerManager(ICustomerDal customer)
	{
		this.customer = customer;
	}
	

	
	public void Add()
	{
		customer.Add();
	}

}
