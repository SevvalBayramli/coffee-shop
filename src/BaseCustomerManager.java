
public abstract class BaseCustomerManager implements ICustomerService {

	

	public void Save(Customer customer) {
		System.out.println("Veri tabanưna kaydedildi "+customer.getFirstName());
		
	}

	protected abstract void CheckIfRealPerson(Customer customer);

}
