public class Customer implements IEntity {
	
	private String FirstName;
	private String LastName ;
	private int DateOfTime;
	private long NationalityId;
	
	public Customer (long NationalityId, String LastName, String FirstName , int DateOfTime) {
		super();
		
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.DateOfTime=DateOfTime;
		this.NationalityId=NationalityId;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDateOfTime() {
		return DateOfTime;
	}
	public void setDateOfTime(int dateOfTime) {
		DateOfTime = dateOfTime;
	}
	public long getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}
	

}
