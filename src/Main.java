import java.rmi.RemoteException;



public class Main {
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer customer=new Customer();
		//Customer customer=new Customer();
		customer.setDateOfTime(2002);
		customer.setFirstName("ÞEVVAL2");
		customer.setLastName("BAYRAMLI");
		//yorum satiri eklendi
		customer.setNationalityId(111111111L);
		
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MerniceServiceAdapter());
				customerManager.Save(new Customer(111111111L, "BAYRAMLI","ÞEVVAL",2002));
				
		BaseCustomerManager customerManager1 =new NeroCustomerManager();
				customerManager1.Save(customer);
		
	}

}
