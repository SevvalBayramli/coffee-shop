
public abstract class BaseCustomerManager implements ICustomerService {

	public void Save(Customer customer) {
		System.out.println("Veri tabanına kaydedildi " + customer.getFirstName());
	}

	public void WriteCustomerName() {

	}

}
