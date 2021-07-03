
public class Main {

	public static void main(String[] args) {
		
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		Customer customer =new Customer();
		customer.setId(1);
		customer.setFirstName("Ahmet");
		customer.setLastName("Yılmaz");
		customer.setDateTime("1985");
		customer.setNationalityId("111111111");
		neroCustomerManager.Save(customer);
		
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
		customer.setId(1);
		customer.setFirstName("Şevval");
		customer.setLastName("Bayramlı");
		customer.setDateTime("2002");
		customer.setNationalityId("2222222222");
		starbucksCustomerManager.Save(customer);

		/*
		if (starbucksCustomerManager.CheckIfRealPerson(customer)) {
			starbucksCustomerManager.Save(customer);
		}
		*/
			
				

	}

}
