package SpringDemo;

public class MysqlCustomerDal implements ICustomerDal{
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
		System.out.println("Mysql Veri Tabanýna Eklendi.");
	}
	
}
