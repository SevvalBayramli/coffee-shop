import java.rmi.RemoteException;

interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
