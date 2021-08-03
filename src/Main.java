import java.rmi.RemoteException;



public class Main {
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer customer=new Customer(24764140536L, "ÞEVVAL", "BAYRAMLI", 2002);
		customer.setDateOfTime(2002);
		customer.setFirstName("ÞEVVAL");
		customer.setLastName("BAYRAMLI");
		customer.setNationalityId(24764140536L);
		
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MerniceServiceAdapter());
				customerManager.Save(new Customer(24764140536L, "BAYRAMLI","ÞEVVAL",2002));
		
	}

}
