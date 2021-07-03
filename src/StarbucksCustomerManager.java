
public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService{

	public StarbucksCustomerManager() {
	}
	
	@Override
	public void Save(Customer customer) {

		//1. yontem diğer taraftaki servisten obje oluşturarak çağrım.
		CustomerCheckManager customerCheckManager = new CustomerCheckManager();
		
		if(customerCheckManager.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks Customer Saved.");
		} else {
			System.out.println("Customer check failed.");
		}
		

		//2. yöntem bu check etme özelliğini buraya kazandırarak buradan yapılan çağrım.
		/*
		if(CheckIfRealPerson(customer)) {
			System.out.println("Starbucks Customer Saved.");
		} else {
			System.out.println("Customer check failed.");
		}
		*/
		
	}

	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		//_customerCheckService=customerCheckService;
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("StarbucksCustomerManager tarafından doğrulandı.");
		return true;
	}
	
	@Override
	public void WriteCustomerName() {
		// TODO Auto-generated method stub
		System.out.println("inside StarbucksCustomerManager");
	}


}
