import java.rmi.RemoteException;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException{
		System.out.println("Saved to database: "+customer.getFirstName());
	}

}
