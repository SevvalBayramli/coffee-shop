
public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("CustomerCheckManager tarafından doğrulandı");
		return true;
	}

}
