
public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public void CheckIfRealPerson(Customer customer) {
		System.out.println(customer.getFirstName()+" Doðrulandý");
	}
	
	

}
