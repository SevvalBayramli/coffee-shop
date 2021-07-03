
public abstract class BaseCustomerManager implements ICustomerService {

	

	public void Save(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi "+customer.getFirstName());
		
	}

	protected abstract void CheckIfRealPerson(Customer customer);

}
