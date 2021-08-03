import java.rmi.RemoteException;

public interface ICustomerService {
	void Save(Customer customer) throws NumberFormatException, RemoteException;

}
