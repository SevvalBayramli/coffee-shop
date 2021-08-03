import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService iCustomerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		this.iCustomerCheckService=iCustomerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException{
		if(iCustomerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks Customer Saved.");
		} else {
			System.out.println("Customer check failed.");
		}	
	}
	}