package SpringDemo;

public class CustomerManager implements ICustomerService
{
	private ICustomerDal customer;
	
	
	//constructor enjection 
	public CustomerManager(ICustomerDal customer)
	{
		this.customer = customer;
	}
	
	//setter enjection için
	//bu kullanýlýrsa applicationContexte de deðiþiklik olur.
	//<property name="CustomerDal" ref="database"></property> //yazýlýr appcontext.xmle
	//public void setCustomerManager(ICustomerDal customer)
	//{
	//	this.customer = customer;
	//}
	
	public void Add()
	{
		customer.Add();
	}

}
