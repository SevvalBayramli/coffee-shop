
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new NeroCustomerManager();
		Customer customer =new Customer();
		customer.setId(1);
		customer.setFirstName("Ahmet");
		customer.setLastName("Yýlmaz");
		customer.setDateTime("1985");
		customer.setNationalityId("111111111");
		customerManager.Save(customer);
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager();
		customerManager1.CheckIfRealPerson(customer);
		

	}

}
