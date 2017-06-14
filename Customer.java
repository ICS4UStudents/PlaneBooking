
public class customer {

    String firstName;
	String lastName;
	String address;
	String phoneNumber;
	
	public void set(String firstName, String lastName, String address, String phoneNumber) {
		// TODO Auto-generated method stub
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
	}
	
	public customer(String f, String l, String a, String p) {
		// TODO Auto-generated constructor stub
		this.set(f,l,a,p);
	
		
	}

	
}
