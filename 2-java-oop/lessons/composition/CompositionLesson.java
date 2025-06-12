package composition;

import java.util.ArrayList;

public class CompositionLesson {
	// create a customer class
	// name
	// phoneNumber
	// email
	// address
	//
	// create a ContactInformation class
	// address addrees;
	// string email;

	// ArrayList<Payments> payments;
	//Create a ContactInformation class
	//	Address address;
	//	String email;
	//
	// create an address class
		//String line1;
		//String line2;
		//String line3;
		//String state;
		//int zipCode;
		//String country;
	// create a payment class
		//double amount;
		//boolean isPaid;
		//

	public static void main(String[] args) {
		Payment payment = new Payment(200.0, true);
		Payment payment2 = new Payment(180.0, false);

		System.out.println(payment);
		System.out.println(payment2);

		Address address = new Address("120 Fake St", "", "City", 70605, "USA", "louisiana");
		Address address2 = new Address("123 Fake St", "", "City", 70605, "USA", "louisiana");
		System.out.println(address);

		ContactInformation contactInformation = new ContactInformation(address, "fakeemail@fake.com", "123-456-7890");
		ContactInformation contactInformation2 = new ContactInformation(address, "fakeemail@fake.com", "123-456-7890");

		System.out.println("contact info ------------");
		System.out.println(contactInformation);
		System.out.println(contactInformation2);

		System.out.println("customer info --------------");
		ArrayList<Payment> payments = new ArrayList<>();
		payments.add(payment);
		payments.add(payment2);

		Customer customer = new Customer("bill","123456789", "bill@bill.com", address);
		Customer customer2 = new Customer("bill","123456789", "bill@bill.com", address);

		System.out.println(customer);
		System.out.println(customer2);


	}

}
