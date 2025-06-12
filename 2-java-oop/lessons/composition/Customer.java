
package composition;
import java.util.ArrayList;
public class Customer {
	String name;
	ContactInformation contactInformation;
	ArrayList<Payment> payments;
	public Customer(String name, String phoneNumber, String email, Address address) {
		this.name = name;
		this.contactInformation = new ContactInformation(address, email, phoneNumber);
		this.payments = new ArrayList<>();
	}

	public String printPayments() {
		String paymentString = "";
		for (Payment payment : payments) {
			paymentString += payment + "\n";
		}
		return paymentString;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ContactInformation getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}
	public ArrayList<Payment> getPayments() {
		return payments;
	}
	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}
	@Override
	public String toString() {
		return name +
				":\n" + contactInformation;
	}
}