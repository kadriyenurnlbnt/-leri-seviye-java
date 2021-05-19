package springIntro;

public class CustomerManager implements ICustomerService{
	
	
	private ICustomerDal customerDal;
	
	public ICustomerDal getCustomerDal() {
		return customerDal;
	}
	
     // setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	//construcctor injection
	//public CustomerManager(ICustomerDal customerDal) {
	//	this.customerDal = customerDal;
	//}
	public void add() {
		// i� kurallar� 		
	
	customerDal.add();
	}

}
