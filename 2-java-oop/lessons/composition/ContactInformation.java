package composition;

public class ContactInformation {
	private Address address;
	private String email;
	private String phoneNumber;

	public ContactInformation(Address address, String email, String phoneNumber) {
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "phone number: " + phoneNumber +
				"\nemail: " + email +
				"\naddress: \n" + address;


	}
}
