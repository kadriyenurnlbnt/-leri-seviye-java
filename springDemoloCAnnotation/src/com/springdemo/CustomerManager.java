package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	
	private ICustomerDal customerDal;
	
	public ICustomerDal getCustomerDal() {
		return customerDal;
	}
	
     // setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
	this.customerDal = customerDal;
	}
	
	
	public void add() {
		// is kurallarý		
	
	customerDal.add();
	}

}
