package com.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MssqlCustomerDal implements ICustomerDal{
	
	@Value("${database.connectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void Add() {
		System.out.println("Connection String: "+this.connectionString);
		System.out.println("MsSQL Eklendi.");
		
	}
	

}
