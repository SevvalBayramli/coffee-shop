
public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService{

	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager() {
		
	}
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService=customerCheckService;
		
	}

	@Override
	public void CheckIfRealPerson(Customer customer) {
		System.out.println(_customerCheckService+" kontrol edildi");
		
	}
		


}
